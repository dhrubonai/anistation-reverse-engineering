package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import defpackage.q71;
import gatewayprotocol.v1.ModuleOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ModuleKt {
    public static final ModuleKt INSTANCE = new ModuleKt();

    private ModuleKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ModuleOuterClass.Module.Builder _builder;

        private Dsl(ModuleOuterClass.Module.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ModuleOuterClass.Module _build() {
            ModuleOuterClass.Module build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearConfig() {
            this._builder.clearConfig();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final ByteString getConfig() {
            ByteString config = this._builder.getConfig();
            config.getClass();
            return config;
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final void setConfig(ByteString byteString) {
            byteString.getClass();
            this._builder.setConfig(byteString);
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(ModuleOuterClass.Module.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ModuleOuterClass.Module.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
