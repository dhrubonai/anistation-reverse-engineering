package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import defpackage.q71;
import gatewayprotocol.v1.RewardedOffersRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class RewardedOffersRequestKt {
    public static final RewardedOffersRequestKt INSTANCE = new RewardedOffersRequestKt();

    private RewardedOffersRequestKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder _builder;

        private Dsl(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ RewardedOffersRequestOuterClass.RewardedOffersRequest _build() {
            RewardedOffersRequestOuterClass.RewardedOffersRequest build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearCursor() {
            this._builder.clearCursor();
        }

        public final void clearEntryPoint() {
            this._builder.clearEntryPoint();
        }

        public final ByteString getCursor() {
            ByteString cursor = this._builder.getCursor();
            cursor.getClass();
            return cursor;
        }

        public final RewardedOffersRequestOuterClass.RewardedOffersEntryPoint getEntryPoint() {
            RewardedOffersRequestOuterClass.RewardedOffersEntryPoint entryPoint = this._builder.getEntryPoint();
            entryPoint.getClass();
            return entryPoint;
        }

        public final int getEntryPointValue() {
            return this._builder.getEntryPointValue();
        }

        public final void setCursor(ByteString byteString) {
            byteString.getClass();
            this._builder.setCursor(byteString);
        }

        public final void setEntryPoint(RewardedOffersRequestOuterClass.RewardedOffersEntryPoint rewardedOffersEntryPoint) {
            rewardedOffersEntryPoint.getClass();
            this._builder.setEntryPoint(rewardedOffersEntryPoint);
        }

        public final void setEntryPointValue(int i) {
            this._builder.setEntryPointValue(i);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(RewardedOffersRequestOuterClass.RewardedOffersRequest.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
