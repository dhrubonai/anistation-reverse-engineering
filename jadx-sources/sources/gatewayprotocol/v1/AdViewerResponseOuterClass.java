package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.m6;
import defpackage.ze0;
import gatewayprotocol.v1.ErrorOuterClass;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AdViewerResponseOuterClass {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public interface AdViewerResponseOrBuilder extends MessageLiteOrBuilder {
        ErrorOuterClass.Error getError();

        ByteString getPayload();

        int getPayloadVersion();

        boolean hasError();
    }

    private AdViewerResponseOuterClass() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class AdViewerResponse extends GeneratedMessageLite<AdViewerResponse, Builder> implements AdViewerResponseOrBuilder {
        private static final AdViewerResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        private static volatile Parser<AdViewerResponse> PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        public static final int PAYLOAD_VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private int payloadVersion_;
        private ByteString payload_ = ByteString.EMPTY;

        static {
            AdViewerResponse adViewerResponse = new AdViewerResponse();
            DEFAULT_INSTANCE = adViewerResponse;
            GeneratedMessageLite.registerDefaultInstance(AdViewerResponse.class, adViewerResponse);
        }

        private AdViewerResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayload() {
            this.payload_ = getDefaultInstance().getPayload();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPayloadVersion() {
            this.payloadVersion_ = 0;
        }

        public static AdViewerResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeError(ErrorOuterClass.Error error) {
            error.getClass();
            ErrorOuterClass.Error error2 = this.error_;
            if (error2 != null && error2 != ErrorOuterClass.Error.getDefaultInstance()) {
                this.error_ = ErrorOuterClass.Error.newBuilder(this.error_).mergeFrom((ErrorOuterClass.Error.Builder) error).buildPartial();
            } else {
                this.error_ = error;
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AdViewerResponse parseDelimitedFrom(InputStream inputStream) {
            return (AdViewerResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdViewerResponse parseFrom(ByteBuffer byteBuffer) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdViewerResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayload(ByteString byteString) {
            byteString.getClass();
            this.payload_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPayloadVersion(int i) {
            this.payloadVersion_ = i;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = m6.a[methodToInvoke.ordinal()];
            m6 m6Var = null;
            switch (i) {
                case 1:
                    return new AdViewerResponse();
                case 2:
                    return new Builder(m6Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "payload_", "payloadVersion_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdViewerResponse> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (AdViewerResponse.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return (byte) 1;
                default:
                    ze0.d();
                case 7:
                    return null;
            }
        }

        @Override // gatewayprotocol.v1.AdViewerResponseOuterClass.AdViewerResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            if (error == null) {
                return ErrorOuterClass.Error.getDefaultInstance();
            }
            return error;
        }

        @Override // gatewayprotocol.v1.AdViewerResponseOuterClass.AdViewerResponseOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        @Override // gatewayprotocol.v1.AdViewerResponseOuterClass.AdViewerResponseOrBuilder
        public int getPayloadVersion() {
            return this.payloadVersion_;
        }

        @Override // gatewayprotocol.v1.AdViewerResponseOuterClass.AdViewerResponseOrBuilder
        public boolean hasError() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<AdViewerResponse, Builder> implements AdViewerResponseOrBuilder {
            private Builder() {
                super(AdViewerResponse.DEFAULT_INSTANCE);
            }

            public Builder clearError() {
                copyOnWrite();
                ((AdViewerResponse) this.instance).clearError();
                return this;
            }

            public Builder clearPayload() {
                copyOnWrite();
                ((AdViewerResponse) this.instance).clearPayload();
                return this;
            }

            public Builder clearPayloadVersion() {
                copyOnWrite();
                ((AdViewerResponse) this.instance).clearPayloadVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.AdViewerResponseOuterClass.AdViewerResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((AdViewerResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.v1.AdViewerResponseOuterClass.AdViewerResponseOrBuilder
            public ByteString getPayload() {
                return ((AdViewerResponse) this.instance).getPayload();
            }

            @Override // gatewayprotocol.v1.AdViewerResponseOuterClass.AdViewerResponseOrBuilder
            public int getPayloadVersion() {
                return ((AdViewerResponse) this.instance).getPayloadVersion();
            }

            @Override // gatewayprotocol.v1.AdViewerResponseOuterClass.AdViewerResponseOrBuilder
            public boolean hasError() {
                return ((AdViewerResponse) this.instance).hasError();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdViewerResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((AdViewerResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                copyOnWrite();
                ((AdViewerResponse) this.instance).setPayload(byteString);
                return this;
            }

            public Builder setPayloadVersion(int i) {
                copyOnWrite();
                ((AdViewerResponse) this.instance).setPayloadVersion(i);
                return this;
            }

            public /* synthetic */ Builder(m6 m6Var) {
                this();
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdViewerResponse) this.instance).setError(error);
                return this;
            }
        }

        public static Builder newBuilder(AdViewerResponse adViewerResponse) {
            return DEFAULT_INSTANCE.createBuilder(adViewerResponse);
        }

        public static AdViewerResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdViewerResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdViewerResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdViewerResponse parseFrom(ByteString byteString) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdViewerResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdViewerResponse parseFrom(byte[] bArr) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdViewerResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdViewerResponse parseFrom(InputStream inputStream) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdViewerResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdViewerResponse parseFrom(CodedInputStream codedInputStream) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdViewerResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdViewerResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
