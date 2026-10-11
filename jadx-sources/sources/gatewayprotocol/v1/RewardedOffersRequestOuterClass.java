package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import defpackage.v55;
import defpackage.ze0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class RewardedOffersRequestOuterClass {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface RewardedOffersRequestOrBuilder extends MessageLiteOrBuilder {
        ByteString getCursor();

        RewardedOffersEntryPoint getEntryPoint();

        int getEntryPointValue();
    }

    private RewardedOffersRequestOuterClass() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class RewardedOffersRequest extends GeneratedMessageLite<RewardedOffersRequest, Builder> implements RewardedOffersRequestOrBuilder {
        public static final int CURSOR_FIELD_NUMBER = 2;
        private static final RewardedOffersRequest DEFAULT_INSTANCE;
        public static final int ENTRY_POINT_FIELD_NUMBER = 1;
        private static volatile Parser<RewardedOffersRequest> PARSER;
        private ByteString cursor_ = ByteString.EMPTY;
        private int entryPoint_;

        static {
            RewardedOffersRequest rewardedOffersRequest = new RewardedOffersRequest();
            DEFAULT_INSTANCE = rewardedOffersRequest;
            GeneratedMessageLite.registerDefaultInstance(RewardedOffersRequest.class, rewardedOffersRequest);
        }

        private RewardedOffersRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCursor() {
            this.cursor_ = getDefaultInstance().getCursor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEntryPoint() {
            this.entryPoint_ = 0;
        }

        public static RewardedOffersRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RewardedOffersRequest parseDelimitedFrom(InputStream inputStream) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RewardedOffersRequest parseFrom(ByteBuffer byteBuffer) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RewardedOffersRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCursor(ByteString byteString) {
            byteString.getClass();
            this.cursor_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPoint(RewardedOffersEntryPoint rewardedOffersEntryPoint) {
            this.entryPoint_ = rewardedOffersEntryPoint.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEntryPointValue(int i) {
            this.entryPoint_ = i;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = v55.a[methodToInvoke.ordinal()];
            v55 v55Var = null;
            switch (i) {
                case 1:
                    return new RewardedOffersRequest();
                case 2:
                    return new Builder(v55Var);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"entryPoint_", "cursor_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RewardedOffersRequest> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (RewardedOffersRequest.class) {
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

        @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
        public ByteString getCursor() {
            return this.cursor_;
        }

        @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
        public RewardedOffersEntryPoint getEntryPoint() {
            RewardedOffersEntryPoint forNumber = RewardedOffersEntryPoint.forNumber(this.entryPoint_);
            if (forNumber == null) {
                return RewardedOffersEntryPoint.UNRECOGNIZED;
            }
            return forNumber;
        }

        @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
        public int getEntryPointValue() {
            return this.entryPoint_;
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<RewardedOffersRequest, Builder> implements RewardedOffersRequestOrBuilder {
            private Builder() {
                super(RewardedOffersRequest.DEFAULT_INSTANCE);
            }

            public Builder clearCursor() {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).clearCursor();
                return this;
            }

            public Builder clearEntryPoint() {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).clearEntryPoint();
                return this;
            }

            @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
            public ByteString getCursor() {
                return ((RewardedOffersRequest) this.instance).getCursor();
            }

            @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
            public RewardedOffersEntryPoint getEntryPoint() {
                return ((RewardedOffersRequest) this.instance).getEntryPoint();
            }

            @Override // gatewayprotocol.v1.RewardedOffersRequestOuterClass.RewardedOffersRequestOrBuilder
            public int getEntryPointValue() {
                return ((RewardedOffersRequest) this.instance).getEntryPointValue();
            }

            public Builder setCursor(ByteString byteString) {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).setCursor(byteString);
                return this;
            }

            public Builder setEntryPoint(RewardedOffersEntryPoint rewardedOffersEntryPoint) {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).setEntryPoint(rewardedOffersEntryPoint);
                return this;
            }

            public Builder setEntryPointValue(int i) {
                copyOnWrite();
                ((RewardedOffersRequest) this.instance).setEntryPointValue(i);
                return this;
            }

            public /* synthetic */ Builder(v55 v55Var) {
                this();
            }
        }

        public static Builder newBuilder(RewardedOffersRequest rewardedOffersRequest) {
            return DEFAULT_INSTANCE.createBuilder(rewardedOffersRequest);
        }

        public static RewardedOffersRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(ByteString byteString) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RewardedOffersRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(byte[] bArr) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RewardedOffersRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(InputStream inputStream) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RewardedOffersRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RewardedOffersRequest parseFrom(CodedInputStream codedInputStream) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RewardedOffersRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RewardedOffersRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @Deprecated
    /* loaded from: classes2.dex */
    public enum RewardedOffersEntryPoint implements Internal.EnumLite {
        REWARDED_OFFERS_ENTRY_POINT_UNSPECIFIED(0),
        REWARDED_OFFERS_ENTRY_POINT_BRIDGE(1),
        REWARDED_OFFERS_ENTRY_POINT_OFFERWALL(2),
        UNRECOGNIZED(-1);

        public static final int REWARDED_OFFERS_ENTRY_POINT_BRIDGE_VALUE = 1;
        public static final int REWARDED_OFFERS_ENTRY_POINT_OFFERWALL_VALUE = 2;
        public static final int REWARDED_OFFERS_ENTRY_POINT_UNSPECIFIED_VALUE = 0;
        private static final Internal.EnumLiteMap<RewardedOffersEntryPoint> internalValueMap = new Object();
        private final int value;

        RewardedOffersEntryPoint(int i) {
            this.value = i;
        }

        public static RewardedOffersEntryPoint forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return REWARDED_OFFERS_ENTRY_POINT_OFFERWALL;
                }
                return REWARDED_OFFERS_ENTRY_POINT_BRIDGE;
            }
            return REWARDED_OFFERS_ENTRY_POINT_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<RewardedOffersEntryPoint> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return h1.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            ze0.k("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static RewardedOffersEntryPoint valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
