package com.salesmanager.shop.commons.model.audit;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class AuditListener {

  @PrePersist
  public void onSave(Object o) {
    if (o instanceof Auditable) {
      Auditable audit = (Auditable) o;
      AuditSection auditSection = audit.getAuditSection();

      auditSection.setDateModified(new Date());
      if (auditSection.getDateCreated() == null) {
        auditSection.setDateCreated(new Date());
      }
      audit.setAuditSection(auditSection);
    }
  }

  @PreUpdate
  public void onUpdate(Object o) {
    if (o instanceof Auditable) {
      Auditable audit = (Auditable) o;
      AuditSection auditSection = audit.getAuditSection();

      auditSection.setDateModified(new Date());
      if (auditSection.getDateCreated() == null) {
        auditSection.setDateCreated(new Date());
      }
      audit.setAuditSection(auditSection);
    }
  }
}
