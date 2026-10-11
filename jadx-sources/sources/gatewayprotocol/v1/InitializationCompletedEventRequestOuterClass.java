package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.ty2;
import defpackage.ze0;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class InitializationCompletedEventRequestOuterClass {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public interface InitializationCompletedEventRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getCoherenceAttributes();

        DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

        StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo();

        boolean hasCoherenceAttributes();

        boolean hasDynamicDeviceInfo();

        boolean hasStaticDeviceInfo();
    }

    private InitializationCompletedEventRequestOuterClass() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class InitializationCompletedEventRequest extends GeneratedMessageLite<InitializationCompletedEventRequest, Builder> implements InitializationCompletedEventRequestOrBuilder {
        public static final int COHERENCE_ATTRIBUTES_FIELD_NUMBER = 3;
        private static final InitializationCompletedEventRequest DEFAULT_INSTANCE;
        public static final int DYNAMIC_DEVICE_INFO_FIELD_NUMBER = 2;
        private static volatile Parser<InitializationCompletedEventRequest> PARSER = null;
        public static final int STATIC_DEVICE_INFO_FIELD_NUMBER = 1;
        private int bitField0_;
        private ByteString coherenceAttributes_ = ByteString.EMPTY;
        private DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo_;
        private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo_;

        static {
            InitializationCompletedEventRequest initializationCompletedEventRequest = new InitializationCompletedEventRequest();
            DEFAULT_INSTANCE = initializationCompletedEventRequest;
            GeneratedMessageLite.registerDefaultInstance(InitializationCompletedEventRequest.class, initializationCompletedEventRequest);
        }

        private InitializationCompletedEventRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoherenceAttributes() {
            this.bitField0_ &= -5;
            this.coherenceAttributes_ = getDefaultInstance().getCoherenceAttributes();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDynamicDeviceInfo() {
            this.dynamicDeviceInfo_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStaticDeviceInfo() {
            this.staticDeviceInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static InitializationCompletedEventRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo2 = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo2 != null && dynamicDeviceInfo2 != DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance()) {
                this.dynamicDeviceInfo_ = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder(this.dynamicDeviceInfo_).mergeFrom((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) dynamicDeviceInfo).buildPartial();
            } else {
                this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo2 = this.staticDeviceInfo_;
            if (staticDeviceInfo2 != null && staticDeviceInfo2 != StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance()) {
                this.staticDeviceInfo_ = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder(this.staticDeviceInfo_).mergeFrom((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) staticDeviceInfo).buildPartial();
            } else {
                this.staticDeviceInfo_ = staticDeviceInfo;
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static InitializationCompletedEventRequest parseDelimitedFrom(InputStream inputStream) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteBuffer byteBuffer) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<InitializationCompletedEventRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoherenceAttributes(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 4;
            this.coherenceAttributes_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this.dynamicDeviceInfo_ = dynamicDeviceInfo;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this.staticDeviceInfo_ = staticDeviceInfo;
            this.bitField0_ |= 1;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = ty2.a[methodToInvoke.ordinal()];
            ty2 ty2Var = null;
            switch (i) {
                case 1:
                    return new InitializationCompletedEventRequest();
                case 2:
                    return new Builder(ty2Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "staticDeviceInfo_", "dynamicDeviceInfo_", "coherenceAttributes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<InitializationCompletedEventRequest> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (InitializationCompletedEventRequest.class) {
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

        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public ByteString getCoherenceAttributes() {
            return this.coherenceAttributes_;
        }

        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.dynamicDeviceInfo_;
            if (dynamicDeviceInfo == null) {
                return DynamicDeviceInfoOuterClass.DynamicDeviceInfo.getDefaultInstance();
            }
            return dynamicDeviceInfo;
        }

        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo_;
            if (staticDeviceInfo == null) {
                return StaticDeviceInfoOuterClass.StaticDeviceInfo.getDefaultInstance();
            }
            return staticDeviceInfo;
        }

        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public boolean hasCoherenceAttributes() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public boolean hasDynamicDeviceInfo() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
        public boolean hasStaticDeviceInfo() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<InitializationCompletedEventRequest, Builder> implements InitializationCompletedEventRequestOrBuilder {
            private Builder() {
                super(InitializationCompletedEventRequest.DEFAULT_INSTANCE);
            }

            public Builder clearCoherenceAttributes() {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).clearCoherenceAttributes();
                return this;
            }

            public Builder clearDynamicDeviceInfo() {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).clearDynamicDeviceInfo();
                return this;
            }

            public Builder clearStaticDeviceInfo() {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).clearStaticDeviceInfo();
                return this;
            }

            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public ByteString getCoherenceAttributes() {
                return ((InitializationCompletedEventRequest) this.instance).getCoherenceAttributes();
            }

            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
                return ((InitializationCompletedEventRequest) this.instance).getDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
                return ((InitializationCompletedEventRequest) this.instance).getStaticDeviceInfo();
            }

            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public boolean hasCoherenceAttributes() {
                return ((InitializationCompletedEventRequest) this.instance).hasCoherenceAttributes();
            }

            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public boolean hasDynamicDeviceInfo() {
                return ((InitializationCompletedEventRequest) this.instance).hasDynamicDeviceInfo();
            }

            @Override // gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequestOrBuilder
            public boolean hasStaticDeviceInfo() {
                return ((InitializationCompletedEventRequest) this.instance).hasStaticDeviceInfo();
            }

            public Builder mergeDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).mergeDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder mergeStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).mergeStaticDeviceInfo(staticDeviceInfo);
                return this;
            }

            public Builder setCoherenceAttributes(ByteString byteString) {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).setCoherenceAttributes(byteString);
                return this;
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder) {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).setDynamicDeviceInfo(builder.build());
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder) {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).setStaticDeviceInfo(builder.build());
                return this;
            }

            public /* synthetic */ Builder(ty2 ty2Var) {
                this();
            }

            public Builder setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).setDynamicDeviceInfo(dynamicDeviceInfo);
                return this;
            }

            public Builder setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
                copyOnWrite();
                ((InitializationCompletedEventRequest) this.instance).setStaticDeviceInfo(staticDeviceInfo);
                return this;
            }
        }

        public static Builder newBuilder(InitializationCompletedEventRequest initializationCompletedEventRequest) {
            return DEFAULT_INSTANCE.createBuilder(initializationCompletedEventRequest);
        }

        public static InitializationCompletedEventRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteString byteString) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static InitializationCompletedEventRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(byte[] bArr) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InitializationCompletedEventRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(InputStream inputStream) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitializationCompletedEventRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static InitializationCompletedEventRequest parseFrom(CodedInputStream codedInputStream) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static InitializationCompletedEventRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitializationCompletedEventRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
