package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import defpackage.q71;
import gatewayprotocol.v1.AdViewerResponseOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AdViewerResponseKt {
    public static final AdViewerResponseKt INSTANCE = new AdViewerResponseKt();

    private AdViewerResponseKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdViewerResponseOuterClass.AdViewerResponse.Builder _builder;

        private Dsl(AdViewerResponseOuterClass.AdViewerResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AdViewerResponseOuterClass.AdViewerResponse _build() {
            AdViewerResponseOuterClass.AdViewerResponse build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final void clearPayloadVersion() {
            this._builder.clearPayloadVersion();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            error.getClass();
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            dsl.getClass();
            return AdViewerResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final ByteString getPayload() {
            ByteString payload = this._builder.getPayload();
            payload.getClass();
            return payload;
        }

        public final int getPayloadVersion() {
            return this._builder.getPayloadVersion();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setError(ErrorOuterClass.Error error) {
            error.getClass();
            this._builder.setError(error);
        }

        public final void setPayload(ByteString byteString) {
            byteString.getClass();
            this._builder.setPayload(byteString);
        }

        public final void setPayloadVersion(int i) {
            this._builder.setPayloadVersion(i);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdViewerResponseOuterClass.AdViewerResponse.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdViewerResponseOuterClass.AdViewerResponse.Builder builder, q71 q71Var) {
            this(builder);
        }
    }
}
