package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.uy2;
import defpackage.ze0;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class InitializationDataOuterClass {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public interface InitializationDataOrBuilder extends MessageLiteOrBuilder {
        InitializationRequestOuterClass.InitializationRequest getInitializationRequest();

        UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData();

        boolean hasInitializationRequest();

        boolean hasSharedData();
    }

    private InitializationDataOuterClass() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class InitializationData extends GeneratedMessageLite<InitializationData, Builder> implements InitializationDataOrBuilder {
        private static final InitializationData DEFAULT_INSTANCE;
        public static final int INITIALIZATION_REQUEST_FIELD_NUMBER = 1;
        private static volatile Parser<InitializationData> PARSER = null;
        public static final int SHARED_DATA_FIELD_NUMBER = 2;
        private int bitField0_;
        private InitializationRequestOuterClass.InitializationRequest initializationRequest_;
        private UniversalRequestOuterClass.UniversalRequest.SharedData sharedData_;

        static {
            InitializationData initializationData = new InitializationData();
            DEFAULT_INSTANCE = initializationData;
            GeneratedMessageLite.registerDefaultInstance(InitializationData.class, initializationData);
        }

        private InitializationData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInitializationRequest() {
            this.initializationRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSharedData() {
            this.sharedData_ = null;
            this.bitField0_ &= -3;
        }

        public static InitializationData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationRequest.getClass();
            InitializationRequestOuterClass.InitializationRequest initializationRequest2 = this.initializationRequest_;
            if (initializationRequest2 != null && initializationRequest2 != InitializationRequestOuterClass.InitializationRequest.getDefaultInstance()) {
                this.initializationRequest_ = InitializationRequestOuterClass.InitializationRequest.newBuilder(this.initializationRequest_).mergeFrom((InitializationRequestOuterClass.InitializationRequest.Builder) initializationRequest).buildPartial();
            } else {
                this.initializationRequest_ = initializationRequest;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData2 = this.sharedData_;
            if (sharedData2 != null && sharedData2 != UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance()) {
                this.sharedData_ = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder(this.sharedData_).mergeFrom((UniversalRequestOuterClass.UniversalRequest.SharedData.Builder) sharedData).buildPartial();
            } else {
                this.sharedData_ = sharedData;
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationData parseDelimitedFrom(InputStream inputStream) {
            return (InitializationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationData parseFrom(ByteBuffer byteBuffer) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InitializationData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            initializationRequest.getClass();
            this.initializationRequest_ = initializationRequest;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            sharedData.getClass();
            this.sharedData_ = sharedData;
            this.bitField0_ |= 2;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = uy2.a[methodToInvoke.ordinal()];
            uy2 uy2Var = null;
            switch (i) {
                case 1:
                    return new InitializationData();
                case 2:
                    return new Builder(uy2Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "initializationRequest_", "sharedData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InitializationData> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (InitializationData.class) {
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

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this.initializationRequest_;
            if (initializationRequest == null) {
                return InitializationRequestOuterClass.InitializationRequest.getDefaultInstance();
            }
            return initializationRequest;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this.sharedData_;
            if (sharedData == null) {
                return UniversalRequestOuterClass.UniversalRequest.SharedData.getDefaultInstance();
            }
            return sharedData;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public boolean hasInitializationRequest() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
        public boolean hasSharedData() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<InitializationData, Builder> implements InitializationDataOrBuilder {
            private Builder() {
                super(InitializationData.DEFAULT_INSTANCE);
            }

            public Builder clearInitializationRequest() {
                copyOnWrite();
                ((InitializationData) this.instance).clearInitializationRequest();
                return this;
            }

            public Builder clearSharedData() {
                copyOnWrite();
                ((InitializationData) this.instance).clearSharedData();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                return ((InitializationData) this.instance).getInitializationRequest();
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
                return ((InitializationData) this.instance).getSharedData();
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public boolean hasInitializationRequest() {
                return ((InitializationData) this.instance).hasInitializationRequest();
            }

            @Override // gatewayprotocol.v1.InitializationDataOuterClass.InitializationDataOrBuilder
            public boolean hasSharedData() {
                return ((InitializationData) this.instance).hasSharedData();
            }

            public Builder mergeInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                copyOnWrite();
                ((InitializationData) this.instance).mergeInitializationRequest(initializationRequest);
                return this;
            }

            public Builder mergeSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                ((InitializationData) this.instance).mergeSharedData(sharedData);
                return this;
            }

            public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                copyOnWrite();
                ((InitializationData) this.instance).setInitializationRequest(builder.build());
                return this;
            }

            public Builder setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                copyOnWrite();
                ((InitializationData) this.instance).setSharedData(builder.build());
                return this;
            }

            public /* synthetic */ Builder(uy2 uy2Var) {
                this();
            }

            public Builder setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                copyOnWrite();
                ((InitializationData) this.instance).setInitializationRequest(initializationRequest);
                return this;
            }

            public Builder setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
                copyOnWrite();
                ((InitializationData) this.instance).setSharedData(sharedData);
                return this;
            }
        }

        public static Builder newBuilder(InitializationData initializationData) {
            return DEFAULT_INSTANCE.createBuilder(initializationData);
        }

        public static InitializationData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationData parseFrom(ByteString byteString) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationData parseFrom(byte[] bArr) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationData parseFrom(InputStream inputStream) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationData parseFrom(CodedInputStream codedInputStream) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
