// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculationImc.proto

package com.philips.api.calculation;

/**
 * Protobuf type {@code calculationImc.CalculationImc}
 */
public  final class CalculationImc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculationImc.CalculationImc)
    CalculationImcOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CalculationImc.newBuilder() to construct.
  private CalculationImc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CalculationImc() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CalculationImc();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CalculationImc(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            height_ = input.readDouble();
            break;
          }
          case 17: {

            weight_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.philips.api.calculation.CalculationImcOuterClass.internal_static_calculationImc_CalculationImc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.philips.api.calculation.CalculationImcOuterClass.internal_static_calculationImc_CalculationImc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.philips.api.calculation.CalculationImc.class, com.philips.api.calculation.CalculationImc.Builder.class);
  }

  public static final int HEIGHT_FIELD_NUMBER = 1;
  private double height_;
  /**
   * <code>double height = 1;</code>
   * @return The height.
   */
  public double getHeight() {
    return height_;
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  private double weight_;
  /**
   * <code>double weight = 2;</code>
   * @return The weight.
   */
  public double getWeight() {
    return weight_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (height_ != 0D) {
      output.writeDouble(1, height_);
    }
    if (weight_ != 0D) {
      output.writeDouble(2, weight_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (height_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, height_);
    }
    if (weight_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, weight_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.philips.api.calculation.CalculationImc)) {
      return super.equals(obj);
    }
    com.philips.api.calculation.CalculationImc other = (com.philips.api.calculation.CalculationImc) obj;

    if (java.lang.Double.doubleToLongBits(getHeight())
        != java.lang.Double.doubleToLongBits(
            other.getHeight())) return false;
    if (java.lang.Double.doubleToLongBits(getWeight())
        != java.lang.Double.doubleToLongBits(
            other.getWeight())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHeight()));
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.philips.api.calculation.CalculationImc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.philips.api.calculation.CalculationImc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.philips.api.calculation.CalculationImc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.philips.api.calculation.CalculationImc parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.philips.api.calculation.CalculationImc prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code calculationImc.CalculationImc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculationImc.CalculationImc)
      com.philips.api.calculation.CalculationImcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.philips.api.calculation.CalculationImcOuterClass.internal_static_calculationImc_CalculationImc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.philips.api.calculation.CalculationImcOuterClass.internal_static_calculationImc_CalculationImc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.philips.api.calculation.CalculationImc.class, com.philips.api.calculation.CalculationImc.Builder.class);
    }

    // Construct using com.philips.api.calculation.CalculationImc.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      height_ = 0D;

      weight_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.philips.api.calculation.CalculationImcOuterClass.internal_static_calculationImc_CalculationImc_descriptor;
    }

    @java.lang.Override
    public com.philips.api.calculation.CalculationImc getDefaultInstanceForType() {
      return com.philips.api.calculation.CalculationImc.getDefaultInstance();
    }

    @java.lang.Override
    public com.philips.api.calculation.CalculationImc build() {
      com.philips.api.calculation.CalculationImc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.philips.api.calculation.CalculationImc buildPartial() {
      com.philips.api.calculation.CalculationImc result = new com.philips.api.calculation.CalculationImc(this);
      result.height_ = height_;
      result.weight_ = weight_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.philips.api.calculation.CalculationImc) {
        return mergeFrom((com.philips.api.calculation.CalculationImc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.philips.api.calculation.CalculationImc other) {
      if (other == com.philips.api.calculation.CalculationImc.getDefaultInstance()) return this;
      if (other.getHeight() != 0D) {
        setHeight(other.getHeight());
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.philips.api.calculation.CalculationImc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.philips.api.calculation.CalculationImc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double height_ ;
    /**
     * <code>double height = 1;</code>
     * @return The height.
     */
    public double getHeight() {
      return height_;
    }
    /**
     * <code>double height = 1;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(double value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double height = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      
      height_ = 0D;
      onChanged();
      return this;
    }

    private double weight_ ;
    /**
     * <code>double weight = 2;</code>
     * @return The weight.
     */
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 2;</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:calculationImc.CalculationImc)
  }

  // @@protoc_insertion_point(class_scope:calculationImc.CalculationImc)
  private static final com.philips.api.calculation.CalculationImc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.philips.api.calculation.CalculationImc();
  }

  public static com.philips.api.calculation.CalculationImc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculationImc>
      PARSER = new com.google.protobuf.AbstractParser<CalculationImc>() {
    @java.lang.Override
    public CalculationImc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CalculationImc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CalculationImc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculationImc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.philips.api.calculation.CalculationImc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
