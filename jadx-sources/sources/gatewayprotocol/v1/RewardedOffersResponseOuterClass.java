package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.w55;
import defpackage.ze0;
import gatewayprotocol.v1.ErrorOuterClass;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class RewardedOffersResponseOuterClass {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface RewardedOffersResponseOrBuilder extends MessageLiteOrBuilder {
        ErrorOuterClass.Error getError();

        ByteString getRewardedOffers();

        int getRewardedOffersVersion();

        boolean hasError();
    }

    private RewardedOffersResponseOuterClass() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class RewardedOffersResponse extends GeneratedMessageLite<RewardedOffersResponse, Builder> implements RewardedOffersResponseOrBuilder {
        private static final RewardedOffersResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        private static volatile Parser<RewardedOffersResponse> PARSER = null;
        public static final int REWARDED_OFFERS_FIELD_NUMBER = 1;
        public static final int REWARDED_OFFERS_VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private ErrorOuterClass.Error error_;
        private int rewardedOffersVersion_;
        private ByteString rewardedOffers_ = ByteString.EMPTY;

        static {
            RewardedOffersResponse rewardedOffersResponse = new RewardedOffersResponse();
            DEFAULT_INSTANCE = rewardedOffersResponse;
            GeneratedMessageLite.registerDefaultInstance(RewardedOffersResponse.class, rewardedOffersResponse);
        }

        private RewardedOffersResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewardedOffers() {
            this.rewardedOffers_ = getDefaultInstance().getRewardedOffers();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRewardedOffersVersion() {
            this.rewardedOffersVersion_ = 0;
        }

        public static RewardedOffersResponse getDefaultInstance() {
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

        public static RewardedOffersResponse parseDelimitedFrom(InputStream inputStream) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RewardedOffersResponse parseFrom(ByteBuffer byteBuffer) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RewardedOffersResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewardedOffers(ByteString byteString) {
            byteString.getClass();
            this.rewardedOffers_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRewardedOffersVersion(int i) {
            this.rewardedOffersVersion_ = i;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = w55.a[methodToInvoke.ordinal()];
            w55 w55Var = null;
            switch (i) {
                case 1:
                    return new RewardedOffersResponse();
                case 2:
                    return new Builder(w55Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "rewardedOffers_", "rewardedOffersVersion_", "error_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RewardedOffersResponse> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (RewardedOffersResponse.class) {
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

        @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            if (error == null) {
                return ErrorOuterClass.Error.getDefaultInstance();
            }
            return error;
        }

        @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
        public ByteString getRewardedOffers() {
            return this.rewardedOffers_;
        }

        @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
        public int getRewardedOffersVersion() {
            return this.rewardedOffersVersion_;
        }

        @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
        public boolean hasError() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<RewardedOffersResponse, Builder> implements RewardedOffersResponseOrBuilder {
            private Builder() {
                super(RewardedOffersResponse.DEFAULT_INSTANCE);
            }

            public Builder clearError() {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).clearError();
                return this;
            }

            public Builder clearRewardedOffers() {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).clearRewardedOffers();
                return this;
            }

            public Builder clearRewardedOffersVersion() {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).clearRewardedOffersVersion();
                return this;
            }

            @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((RewardedOffersResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
            public ByteString getRewardedOffers() {
                return ((RewardedOffersResponse) this.instance).getRewardedOffers();
            }

            @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
            public int getRewardedOffersVersion() {
                return ((RewardedOffersResponse) this.instance).getRewardedOffersVersion();
            }

            @Override // gatewayprotocol.v1.RewardedOffersResponseOuterClass.RewardedOffersResponseOrBuilder
            public boolean hasError() {
                return ((RewardedOffersResponse) this.instance).hasError();
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setRewardedOffers(ByteString byteString) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).setRewardedOffers(byteString);
                return this;
            }

            public Builder setRewardedOffersVersion(int i) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).setRewardedOffersVersion(i);
                return this;
            }

            public /* synthetic */ Builder(w55 w55Var) {
                this();
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((RewardedOffersResponse) this.instance).setError(error);
                return this;
            }
        }

        public static Builder newBuilder(RewardedOffersResponse rewardedOffersResponse) {
            return DEFAULT_INSTANCE.createBuilder(rewardedOffersResponse);
        }

        public static RewardedOffersResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(ByteString byteString) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RewardedOffersResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(byte[] bArr) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RewardedOffersResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(InputStream inputStream) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RewardedOffersResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RewardedOffersResponse parseFrom(CodedInputStream codedInputStream) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RewardedOffersResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
