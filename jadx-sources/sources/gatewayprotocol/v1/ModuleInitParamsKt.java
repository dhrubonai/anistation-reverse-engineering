package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import defpackage.q71;
import gatewayprotocol.v1.ModuleInitParamsOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ModuleInitParamsKt {
    public static final ModuleInitParamsKt INSTANCE = new ModuleInitParamsKt();

    private ModuleInitParamsKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ModuleInitParamsOuterClass.ModuleInitParams.Builder _builder;

        private Dsl(ModuleInitParamsOuterClass.ModuleInitParams.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ModuleInitParamsOuterClass.ModuleInitParams _build() {
            ModuleInitParamsOuterClass.ModuleInitParams build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearClassName() {
            this._builder.clearClassName();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearParams() {
            this._builder.clearParams();
        }

        public final String getClassName() {
            String className = this._builder.getClassName();
            className.getClass();
            return className;
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final ByteString getParams() {
            ByteString params = this._builder.getParams();
            params.getClass();
            return params;
        }

        public final void setClassName(String str) {
            str.getClass();
            this._builder.setClassName(str);
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final void setParams(ByteString byteString) {
            byteString.getClass();
            this._builder.setParams(byteString);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(ModuleInitParamsOuterClass.ModuleInitParams.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ModuleInitParamsOuterClass.ModuleInitParams.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
