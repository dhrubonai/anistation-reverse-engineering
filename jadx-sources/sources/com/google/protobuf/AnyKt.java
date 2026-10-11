package com.google.protobuf;

import com.google.protobuf.Any;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    private AnyKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Any.Builder _builder;

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Any _build() {
            Any build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            typeUrl.getClass();
            return typeUrl;
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            value.getClass();
            return value;
        }

        public final void setTypeUrl(String str) {
            str.getClass();
            this._builder.setTypeUrl(str);
        }

        public final void setValue(ByteString byteString) {
            byteString.getClass();
            this._builder.setValue(byteString);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Any.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
