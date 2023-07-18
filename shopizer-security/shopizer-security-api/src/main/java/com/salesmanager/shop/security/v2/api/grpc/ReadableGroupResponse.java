// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shopizer-security.proto

package com.salesmanager.shop.security.v2.api.grpc;

/**
 * Protobuf type {@code shopizer.security.ReadableGroupResponse}
 */
public final class ReadableGroupResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shopizer.security.ReadableGroupResponse)
    ReadableGroupResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReadableGroupResponse.newBuilder() to construct.
  private ReadableGroupResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReadableGroupResponse() {
    groups_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReadableGroupResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ServiceDiscoveryOuter.internal_static_shopizer_security_ReadableGroupResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ServiceDiscoveryOuter.internal_static_shopizer_security_ReadableGroupResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ReadableGroupResponse.class, Builder.class);
  }

  public static final int GROUPS_FIELD_NUMBER = 1;
  private java.util.List<ReadableGroup> groups_;
  /**
   * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
   */
  @Override
  public java.util.List<ReadableGroup> getGroupsList() {
    return groups_;
  }
  /**
   * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
   */
  @Override
  public java.util.List<? extends ReadableGroupOrBuilder>
      getGroupsOrBuilderList() {
    return groups_;
  }
  /**
   * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
   */
  @Override
  public int getGroupsCount() {
    return groups_.size();
  }
  /**
   * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
   */
  @Override
  public ReadableGroup getGroups(int index) {
    return groups_.get(index);
  }
  /**
   * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
   */
  @Override
  public ReadableGroupOrBuilder getGroupsOrBuilder(
      int index) {
    return groups_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < groups_.size(); i++) {
      output.writeMessage(1, groups_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < groups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, groups_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ReadableGroupResponse)) {
      return super.equals(obj);
    }
    ReadableGroupResponse other = (ReadableGroupResponse) obj;

    if (!getGroupsList()
        .equals(other.getGroupsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getGroupsCount() > 0) {
      hash = (37 * hash) + GROUPS_FIELD_NUMBER;
      hash = (53 * hash) + getGroupsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ReadableGroupResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReadableGroupResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReadableGroupResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReadableGroupResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReadableGroupResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReadableGroupResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReadableGroupResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReadableGroupResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReadableGroupResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ReadableGroupResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReadableGroupResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReadableGroupResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ReadableGroupResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code shopizer.security.ReadableGroupResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shopizer.security.ReadableGroupResponse)
      ReadableGroupResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceDiscoveryOuter.internal_static_shopizer_security_ReadableGroupResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceDiscoveryOuter.internal_static_shopizer_security_ReadableGroupResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReadableGroupResponse.class, Builder.class);
    }

    // Construct using com.salesmanager.shop.security.v2.api.grpc.ReadableGroupResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
      } else {
        groups_ = null;
        groupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ServiceDiscoveryOuter.internal_static_shopizer_security_ReadableGroupResponse_descriptor;
    }

    @Override
    public ReadableGroupResponse getDefaultInstanceForType() {
      return ReadableGroupResponse.getDefaultInstance();
    }

    @Override
    public ReadableGroupResponse build() {
      ReadableGroupResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ReadableGroupResponse buildPartial() {
      ReadableGroupResponse result = new ReadableGroupResponse(this);
      int from_bitField0_ = bitField0_;
      if (groupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          groups_ = java.util.Collections.unmodifiableList(groups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.groups_ = groups_;
      } else {
        result.groups_ = groupsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ReadableGroupResponse) {
        return mergeFrom((ReadableGroupResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ReadableGroupResponse other) {
      if (other == ReadableGroupResponse.getDefaultInstance()) return this;
      if (groupsBuilder_ == null) {
        if (!other.groups_.isEmpty()) {
          if (groups_.isEmpty()) {
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGroupsIsMutable();
            groups_.addAll(other.groups_);
          }
          onChanged();
        }
      } else {
        if (!other.groups_.isEmpty()) {
          if (groupsBuilder_.isEmpty()) {
            groupsBuilder_.dispose();
            groupsBuilder_ = null;
            groups_ = other.groups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            groupsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGroupsFieldBuilder() : null;
          } else {
            groupsBuilder_.addAllMessages(other.groups_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              ReadableGroup m =
                  input.readMessage(
                      ReadableGroup.parser(),
                      extensionRegistry);
              if (groupsBuilder_ == null) {
                ensureGroupsIsMutable();
                groups_.add(m);
              } else {
                groupsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<ReadableGroup> groups_ =
      java.util.Collections.emptyList();
    private void ensureGroupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        groups_ = new java.util.ArrayList<ReadableGroup>(groups_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ReadableGroup, ReadableGroup.Builder, ReadableGroupOrBuilder> groupsBuilder_;

    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public java.util.List<ReadableGroup> getGroupsList() {
      if (groupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(groups_);
      } else {
        return groupsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public int getGroupsCount() {
      if (groupsBuilder_ == null) {
        return groups_.size();
      } else {
        return groupsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public ReadableGroup getGroups(int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);
      } else {
        return groupsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder setGroups(
        int index, ReadableGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.set(index, value);
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder setGroups(
        int index, ReadableGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.set(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder addGroups(ReadableGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder addGroups(
        int index, ReadableGroup value) {
      if (groupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGroupsIsMutable();
        groups_.add(index, value);
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder addGroups(
        ReadableGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder addGroups(
        int index, ReadableGroup.Builder builderForValue) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.add(index, builderForValue.build());
        onChanged();
      } else {
        groupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder addAllGroups(
        Iterable<? extends ReadableGroup> values) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, groups_);
        onChanged();
      } else {
        groupsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder clearGroups() {
      if (groupsBuilder_ == null) {
        groups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        groupsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public Builder removeGroups(int index) {
      if (groupsBuilder_ == null) {
        ensureGroupsIsMutable();
        groups_.remove(index);
        onChanged();
      } else {
        groupsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public ReadableGroup.Builder getGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public ReadableGroupOrBuilder getGroupsOrBuilder(
        int index) {
      if (groupsBuilder_ == null) {
        return groups_.get(index);  } else {
        return groupsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public java.util.List<? extends ReadableGroupOrBuilder>
         getGroupsOrBuilderList() {
      if (groupsBuilder_ != null) {
        return groupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(groups_);
      }
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public ReadableGroup.Builder addGroupsBuilder() {
      return getGroupsFieldBuilder().addBuilder(
          ReadableGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public ReadableGroup.Builder addGroupsBuilder(
        int index) {
      return getGroupsFieldBuilder().addBuilder(
          index, ReadableGroup.getDefaultInstance());
    }
    /**
     * <code>repeated .shopizer.security.ReadableGroup groups = 1;</code>
     */
    public java.util.List<ReadableGroup.Builder>
         getGroupsBuilderList() {
      return getGroupsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ReadableGroup, ReadableGroup.Builder, ReadableGroupOrBuilder>
        getGroupsFieldBuilder() {
      if (groupsBuilder_ == null) {
        groupsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ReadableGroup, ReadableGroup.Builder, ReadableGroupOrBuilder>(
                groups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        groups_ = null;
      }
      return groupsBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:shopizer.security.ReadableGroupResponse)
  }

  // @@protoc_insertion_point(class_scope:shopizer.security.ReadableGroupResponse)
  private static final ReadableGroupResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReadableGroupResponse();
  }

  public static ReadableGroupResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadableGroupResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReadableGroupResponse>() {
    @Override
    public ReadableGroupResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ReadableGroupResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ReadableGroupResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public ReadableGroupResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
