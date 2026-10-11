package gatewayprotocol.v1;

import defpackage.q71;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AccelerometerCollectionConfigurationKt {
    public static final AccelerometerCollectionConfigurationKt INSTANCE = new AccelerometerCollectionConfigurationKt();

    private AccelerometerCollectionConfigurationKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.AccelerometerCollectionConfiguration.Builder _builder;

        private Dsl(NativeConfigurationOuterClass.AccelerometerCollectionConfiguration.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeConfigurationOuterClass.AccelerometerCollectionConfiguration _build() {
            NativeConfigurationOuterClass.AccelerometerCollectionConfiguration build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearMaxSamples() {
            this._builder.clearMaxSamples();
        }

        public final void clearSamplingIntervalMs() {
            this._builder.clearSamplingIntervalMs();
        }

        public final int getMaxSamples() {
            return this._builder.getMaxSamples();
        }

        public final int getSamplingIntervalMs() {
            return this._builder.getSamplingIntervalMs();
        }

        public final void setMaxSamples(int i) {
            this._builder.setMaxSamples(i);
        }

        public final void setSamplingIntervalMs(int i) {
            this._builder.setSamplingIntervalMs(i);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.AccelerometerCollectionConfiguration.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.AccelerometerCollectionConfiguration.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
