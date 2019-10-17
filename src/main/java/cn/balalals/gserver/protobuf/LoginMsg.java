// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto

package cn.balalals.gserver.protobuf;

/**
 * Protobuf type {@code LoginMsg}
 */
public final class LoginMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:LoginMsg)
        LoginMsgOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use LoginMsg.newBuilder() to construct.
    private LoginMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private LoginMsg() {
        account_ = "";
        password_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new LoginMsg();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private LoginMsg(
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
                    case 10: {
                        java.lang.String s = input.readStringRequireUtf8();

                        account_ = s;
                        break;
                    }
                    case 18: {
                        java.lang.String s = input.readStringRequireUtf8();

                        password_ = s;
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
        return cn.balalals.gserver.protobuf.MsgOuterClass.internal_static_LoginMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.balalals.gserver.protobuf.MsgOuterClass.internal_static_LoginMsg_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.balalals.gserver.protobuf.LoginMsg.class, cn.balalals.gserver.protobuf.LoginMsg.Builder.class);
    }

    public static final int ACCOUNT_FIELD_NUMBER = 1;
    private volatile java.lang.Object account_;

    /**
     * <code>string account = 1;</code>
     *
     * @return The account.
     */
    public java.lang.String getAccount() {
        java.lang.Object ref = account_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            account_ = s;
            return s;
        }
    }

    /**
     * <code>string account = 1;</code>
     *
     * @return The bytes for account.
     */
    public com.google.protobuf.ByteString
    getAccountBytes() {
        java.lang.Object ref = account_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            account_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int PASSWORD_FIELD_NUMBER = 2;
    private volatile java.lang.Object password_;

    /**
     * <code>string password = 2;</code>
     *
     * @return The password.
     */
    public java.lang.String getPassword() {
        java.lang.Object ref = password_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            password_ = s;
            return s;
        }
    }

    /**
     * <code>string password = 2;</code>
     *
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
    getPasswordBytes() {
        java.lang.Object ref = password_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            password_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
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
        if (!getAccountBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, account_);
        }
        if (!getPasswordBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, password_);
        }
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getAccountBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, account_);
        }
        if (!getPasswordBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, password_);
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
        if (!(obj instanceof cn.balalals.gserver.protobuf.LoginMsg)) {
            return super.equals(obj);
        }
        cn.balalals.gserver.protobuf.LoginMsg other = (cn.balalals.gserver.protobuf.LoginMsg) obj;

        if (!getAccount()
                .equals(other.getAccount())) return false;
        if (!getPassword()
                .equals(other.getPassword())) return false;
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
        hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
        hash = (53 * hash) + getAccount().hashCode();
        hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
        hash = (53 * hash) + getPassword().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.balalals.gserver.protobuf.LoginMsg parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(cn.balalals.gserver.protobuf.LoginMsg prototype) {
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
     * Protobuf type {@code LoginMsg}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:LoginMsg)
            cn.balalals.gserver.protobuf.LoginMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.balalals.gserver.protobuf.MsgOuterClass.internal_static_LoginMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.balalals.gserver.protobuf.MsgOuterClass.internal_static_LoginMsg_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.balalals.gserver.protobuf.LoginMsg.class, cn.balalals.gserver.protobuf.LoginMsg.Builder.class);
        }

        // Construct using cn.balalals.im.protobuf.LoginMsg.newBuilder()
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
            account_ = "";

            password_ = "";

            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.balalals.gserver.protobuf.MsgOuterClass.internal_static_LoginMsg_descriptor;
        }

        @java.lang.Override
        public cn.balalals.gserver.protobuf.LoginMsg getDefaultInstanceForType() {
            return cn.balalals.gserver.protobuf.LoginMsg.getDefaultInstance();
        }

        @java.lang.Override
        public cn.balalals.gserver.protobuf.LoginMsg build() {
            cn.balalals.gserver.protobuf.LoginMsg result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public cn.balalals.gserver.protobuf.LoginMsg buildPartial() {
            cn.balalals.gserver.protobuf.LoginMsg result = new cn.balalals.gserver.protobuf.LoginMsg(this);
            result.account_ = account_;
            result.password_ = password_;
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
            if (other instanceof cn.balalals.gserver.protobuf.LoginMsg) {
                return mergeFrom((cn.balalals.gserver.protobuf.LoginMsg) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.balalals.gserver.protobuf.LoginMsg other) {
            if (other == cn.balalals.gserver.protobuf.LoginMsg.getDefaultInstance()) return this;
            if (!other.getAccount().isEmpty()) {
                account_ = other.account_;
                onChanged();
            }
            if (!other.getPassword().isEmpty()) {
                password_ = other.password_;
                onChanged();
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
            cn.balalals.gserver.protobuf.LoginMsg parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (cn.balalals.gserver.protobuf.LoginMsg) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private java.lang.Object account_ = "";

        /**
         * <code>string account = 1;</code>
         *
         * @return The account.
         */
        public java.lang.String getAccount() {
            java.lang.Object ref = account_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                account_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string account = 1;</code>
         *
         * @return The bytes for account.
         */
        public com.google.protobuf.ByteString
        getAccountBytes() {
            java.lang.Object ref = account_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                account_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string account = 1;</code>
         *
         * @param value The account to set.
         * @return This builder for chaining.
         */
        public Builder setAccount(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            account_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string account = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearAccount() {

            account_ = getDefaultInstance().getAccount();
            onChanged();
            return this;
        }

        /**
         * <code>string account = 1;</code>
         *
         * @param value The bytes for account to set.
         * @return This builder for chaining.
         */
        public Builder setAccountBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            account_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object password_ = "";

        /**
         * <code>string password = 2;</code>
         *
         * @return The password.
         */
        public java.lang.String getPassword() {
            java.lang.Object ref = password_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                password_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string password = 2;</code>
         *
         * @return The bytes for password.
         */
        public com.google.protobuf.ByteString
        getPasswordBytes() {
            java.lang.Object ref = password_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                password_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string password = 2;</code>
         *
         * @param value The password to set.
         * @return This builder for chaining.
         */
        public Builder setPassword(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            password_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string password = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearPassword() {

            password_ = getDefaultInstance().getPassword();
            onChanged();
            return this;
        }

        /**
         * <code>string password = 2;</code>
         *
         * @param value The bytes for password to set.
         * @return This builder for chaining.
         */
        public Builder setPasswordBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            password_ = value;
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


        // @@protoc_insertion_point(builder_scope:LoginMsg)
    }

    // @@protoc_insertion_point(class_scope:LoginMsg)
    private static final cn.balalals.gserver.protobuf.LoginMsg DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.balalals.gserver.protobuf.LoginMsg();
    }

    public static cn.balalals.gserver.protobuf.LoginMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginMsg>
            PARSER = new com.google.protobuf.AbstractParser<LoginMsg>() {
        @java.lang.Override
        public LoginMsg parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new LoginMsg(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<LoginMsg> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LoginMsg> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public cn.balalals.gserver.protobuf.LoginMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

