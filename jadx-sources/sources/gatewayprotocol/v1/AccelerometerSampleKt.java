package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import defpackage.q71;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AccelerometerSampleKt {
    public static final AccelerometerSampleKt INSTANCE = new AccelerometerSampleKt();

    private AccelerometerSampleKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DynamicDeviceInfoOuterClass.AccelerometerSample.Builder _builder;

        private Dsl(DynamicDeviceInfoOuterClass.AccelerometerSample.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DynamicDeviceInfoOuterClass.AccelerometerSample _build() {
            DynamicDeviceInfoOuterClass.AccelerometerSample build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearClientTimestamp() {
            this._builder.clearClientTimestamp();
        }

        public final void clearX() {
            this._builder.clearX();
        }

        public final void clearY() {
            this._builder.clearY();
        }

        public final void clearZ() {
            this._builder.clearZ();
        }

        public final Timestamp getClientTimestamp() {
            Timestamp clientTimestamp = this._builder.getClientTimestamp();
            clientTimestamp.getClass();
            return clientTimestamp;
        }

        public final float getX() {
            return this._builder.getX();
        }

        public final float getY() {
            return this._builder.getY();
        }

        public final float getZ() {
            return this._builder.getZ();
        }

        public final boolean hasClientTimestamp() {
            return this._builder.hasClientTimestamp();
        }

        public final void setClientTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this._builder.setClientTimestamp(timestamp);
        }

        public final void setX(float f) {
            this._builder.setX(f);
        }

        public final void setY(float f) {
            this._builder.setY(f);
        }

        public final void setZ(float f) {
            this._builder.setZ(f);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(DynamicDeviceInfoOuterClass.AccelerometerSample.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DynamicDeviceInfoOuterClass.AccelerometerSample.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
