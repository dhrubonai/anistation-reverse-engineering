package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.u5;
import defpackage.ze0;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AdDataRefreshResponseOuterClass {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public interface AdDataRefreshResponseOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        ByteString getAdDataRefreshToken();

        int getAdDataVersion();

        CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata();

        ErrorOuterClass.Error getError();

        ByteString getTrackingToken();

        boolean hasCampaignMetadata();

        boolean hasError();
    }

    private AdDataRefreshResponseOuterClass() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class AdDataRefreshResponse extends GeneratedMessageLite<AdDataRefreshResponse, Builder> implements AdDataRefreshResponseOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 4;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        public static final int CAMPAIGN_METADATA_FIELD_NUMBER = 6;
        private static final AdDataRefreshResponse DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 5;
        private static volatile Parser<AdDataRefreshResponse> PARSER = null;
        public static final int TRACKING_TOKEN_FIELD_NUMBER = 3;
        private ByteString adDataRefreshToken_;
        private int adDataVersion_;
        private ByteString adData_;
        private int bitField0_;
        private CampaignMetadataOuterClass.CampaignMetadata campaignMetadata_;
        private ErrorOuterClass.Error error_;
        private ByteString trackingToken_;

        static {
            AdDataRefreshResponse adDataRefreshResponse = new AdDataRefreshResponse();
            DEFAULT_INSTANCE = adDataRefreshResponse;
            GeneratedMessageLite.registerDefaultInstance(AdDataRefreshResponse.class, adDataRefreshResponse);
        }

        private AdDataRefreshResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.adData_ = byteString;
            this.trackingToken_ = byteString;
            this.adDataRefreshToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataRefreshToken() {
            this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCampaignMetadata() {
            this.campaignMetadata_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingToken() {
            this.trackingToken_ = getDefaultInstance().getTrackingToken();
        }

        public static AdDataRefreshResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
            campaignMetadata.getClass();
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata2 = this.campaignMetadata_;
            if (campaignMetadata2 != null && campaignMetadata2 != CampaignMetadataOuterClass.CampaignMetadata.getDefaultInstance()) {
                this.campaignMetadata_ = CampaignMetadataOuterClass.CampaignMetadata.newBuilder(this.campaignMetadata_).mergeFrom((CampaignMetadataOuterClass.CampaignMetadata.Builder) campaignMetadata).buildPartial();
            } else {
                this.campaignMetadata_ = campaignMetadata;
            }
            this.bitField0_ |= 2;
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

        public static AdDataRefreshResponse parseDelimitedFrom(InputStream inputStream) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdDataRefreshResponse parseFrom(ByteBuffer byteBuffer) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AdDataRefreshResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdData(ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataRefreshToken(ByteString byteString) {
            byteString.getClass();
            this.adDataRefreshToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataVersion(int i) {
            this.adDataVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
            campaignMetadata.getClass();
            this.campaignMetadata_ = campaignMetadata;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingToken(ByteString byteString) {
            byteString.getClass();
            this.trackingToken_ = byteString;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = u5.a[methodToInvoke.ordinal()];
            u5 u5Var = null;
            switch (i) {
                case 1:
                    return new AdDataRefreshResponse();
                case 2:
                    return new Builder(u5Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n\u0004\n\u0005ဉ\u0000\u0006ဉ\u0001", new Object[]{"bitField0_", "adData_", "adDataVersion_", "trackingToken_", "adDataRefreshToken_", "error_", "campaignMetadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AdDataRefreshResponse> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (AdDataRefreshResponse.class) {
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

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return this.adDataRefreshToken_;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = this.campaignMetadata_;
            if (campaignMetadata == null) {
                return CampaignMetadataOuterClass.CampaignMetadata.getDefaultInstance();
            }
            return campaignMetadata;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this.error_;
            if (error == null) {
                return ErrorOuterClass.Error.getDefaultInstance();
            }
            return error;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public ByteString getTrackingToken() {
            return this.trackingToken_;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public boolean hasCampaignMetadata() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
        public boolean hasError() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<AdDataRefreshResponse, Builder> implements AdDataRefreshResponseOrBuilder {
            private Builder() {
                super(AdDataRefreshResponse.DEFAULT_INSTANCE);
            }

            public Builder clearAdData() {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataRefreshToken() {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).clearAdDataRefreshToken();
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearCampaignMetadata() {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).clearCampaignMetadata();
                return this;
            }

            public Builder clearError() {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).clearError();
                return this;
            }

            public Builder clearTrackingToken() {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).clearTrackingToken();
                return this;
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public ByteString getAdData() {
                return ((AdDataRefreshResponse) this.instance).getAdData();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public ByteString getAdDataRefreshToken() {
                return ((AdDataRefreshResponse) this.instance).getAdDataRefreshToken();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public int getAdDataVersion() {
                return ((AdDataRefreshResponse) this.instance).getAdDataVersion();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
                return ((AdDataRefreshResponse) this.instance).getCampaignMetadata();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public ErrorOuterClass.Error getError() {
                return ((AdDataRefreshResponse) this.instance).getError();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public ByteString getTrackingToken() {
                return ((AdDataRefreshResponse) this.instance).getTrackingToken();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public boolean hasCampaignMetadata() {
                return ((AdDataRefreshResponse) this.instance).hasCampaignMetadata();
            }

            @Override // gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder
            public boolean hasError() {
                return ((AdDataRefreshResponse) this.instance).hasError();
            }

            public Builder mergeCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).mergeCampaignMetadata(campaignMetadata);
                return this;
            }

            public Builder mergeError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).mergeError(error);
                return this;
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).setAdData(byteString);
                return this;
            }

            public Builder setAdDataRefreshToken(ByteString byteString) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).setAdDataRefreshToken(byteString);
                return this;
            }

            public Builder setAdDataVersion(int i) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).setAdDataVersion(i);
                return this;
            }

            public Builder setCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata.Builder builder) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).setCampaignMetadata(builder.build());
                return this;
            }

            public Builder setError(ErrorOuterClass.Error.Builder builder) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).setError(builder.build());
                return this;
            }

            public Builder setTrackingToken(ByteString byteString) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).setTrackingToken(byteString);
                return this;
            }

            public /* synthetic */ Builder(u5 u5Var) {
                this();
            }

            public Builder setCampaignMetadata(CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).setCampaignMetadata(campaignMetadata);
                return this;
            }

            public Builder setError(ErrorOuterClass.Error error) {
                copyOnWrite();
                ((AdDataRefreshResponse) this.instance).setError(error);
                return this;
            }
        }

        public static Builder newBuilder(AdDataRefreshResponse adDataRefreshResponse) {
            return DEFAULT_INSTANCE.createBuilder(adDataRefreshResponse);
        }

        public static AdDataRefreshResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(ByteString byteString) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AdDataRefreshResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(byte[] bArr) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdDataRefreshResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(InputStream inputStream) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdDataRefreshResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AdDataRefreshResponse parseFrom(CodedInputStream codedInputStream) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AdDataRefreshResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdDataRefreshResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
