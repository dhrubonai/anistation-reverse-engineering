package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import defpackage.q71;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.RewardedOffersResponseOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class RewardedOffersResponseKt {
    public static final RewardedOffersResponseKt INSTANCE = new RewardedOffersResponseKt();

    private RewardedOffersResponseKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder _builder;

        private Dsl(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RewardedOffersResponseOuterClass.RewardedOffersResponse _build() {
            RewardedOffersResponseOuterClass.RewardedOffersResponse build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearRewardedOffers() {
            this._builder.clearRewardedOffers();
        }

        public final void clearRewardedOffersVersion() {
            this._builder.clearRewardedOffersVersion();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            error.getClass();
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            dsl.getClass();
            return RewardedOffersResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final ByteString getRewardedOffers() {
            ByteString rewardedOffers = this._builder.getRewardedOffers();
            rewardedOffers.getClass();
            return rewardedOffers;
        }

        public final int getRewardedOffersVersion() {
            return this._builder.getRewardedOffersVersion();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this._builder.setError(error);
        }

        public final void setRewardedOffers(ByteString byteString) {
            byteString.getClass();
            this._builder.setRewardedOffers(byteString);
        }

        public final void setRewardedOffersVersion(int i) {
            this._builder.setRewardedOffersVersion(i);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(RewardedOffersResponseOuterClass.RewardedOffersResponse.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
