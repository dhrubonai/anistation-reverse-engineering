package com.google.protobuf;

import com.google.protobuf.Mixin;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MixinKt {
    public static final MixinKt INSTANCE = new MixinKt();

    private MixinKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Mixin.Builder _builder;

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Mixin _build() {
            Mixin build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final String getRoot() {
            String root = this._builder.getRoot();
            root.getClass();
            return root;
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final void setRoot(String str) {
            str.getClass();
            this._builder.setRoot(str);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
