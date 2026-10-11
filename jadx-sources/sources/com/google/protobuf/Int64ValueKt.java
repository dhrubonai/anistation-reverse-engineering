package com.google.protobuf;

import com.google.protobuf.Int64Value;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class Int64ValueKt {
    public static final Int64ValueKt INSTANCE = new Int64ValueKt();

    private Int64ValueKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int64Value.Builder _builder;

        private Dsl(Int64Value.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Int64Value _build() {
            Int64Value build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final long getValue() {
            return this._builder.getValue();
        }

        public final void setValue(long j) {
            this._builder.setValue(j);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int64Value.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Int64Value.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
