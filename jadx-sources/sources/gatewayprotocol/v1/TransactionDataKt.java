package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import defpackage.de1;
import defpackage.q71;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class TransactionDataKt {
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    private TransactionDataKt() {
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearJwsRepresentation() {
            this._builder.clearJwsRepresentation();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearSignature() {
            this._builder.clearSignature();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            eventId.getClass();
            return eventId;
        }

        public final String getJwsRepresentation() {
            String jwsRepresentation = this._builder.getJwsRepresentation();
            jwsRepresentation.getClass();
            return jwsRepresentation;
        }

        public final String getProduct() {
            String product = this._builder.getProduct();
            product.getClass();
            return product;
        }

        public final String getProductId() {
            String productId = this._builder.getProductId();
            productId.getClass();
            return productId;
        }

        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            receipt.getClass();
            return receipt;
        }

        public final String getSignature() {
            String signature = this._builder.getSignature();
            signature.getClass();
            return signature;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            timestamp.getClass();
            return timestamp;
        }

        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            transaction.getClass();
            return transaction;
        }

        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            transactionId.getClass();
            return transactionId;
        }

        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            transactionState.getClass();
            return transactionState;
        }

        public final int getTransactionStateValue() {
            return this._builder.getTransactionStateValue();
        }

        public final boolean hasJwsRepresentation() {
            return this._builder.hasJwsRepresentation();
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasSignature() {
            return this._builder.hasSignature();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(ByteString byteString) {
            byteString.getClass();
            this._builder.setEventId(byteString);
        }

        public final void setJwsRepresentation(String str) {
            str.getClass();
            this._builder.setJwsRepresentation(str);
        }

        public final void setProduct(String str) {
            str.getClass();
            this._builder.setProduct(str);
        }

        public final void setProductId(String str) {
            str.getClass();
            this._builder.setProductId(str);
        }

        public final void setReceipt(String str) {
            str.getClass();
            this._builder.setReceipt(str);
        }

        public final void setSignature(String str) {
            str.getClass();
            this._builder.setSignature(str);
        }

        public final void setTimestamp(Timestamp timestamp) {
            timestamp.getClass();
            this._builder.setTimestamp(timestamp);
        }

        public final void setTransaction(String str) {
            str.getClass();
            this._builder.setTransaction(str);
        }

        public final void setTransactionId(String str) {
            str.getClass();
            this._builder.setTransactionId(str);
        }

        public final void setTransactionState(TransactionEventRequestOuterClass.TransactionState transactionState) {
            transactionState.getClass();
            this._builder.setTransactionState(transactionState);
        }

        public final void setTransactionStateValue(int i) {
            this._builder.setTransactionStateValue(i);
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, q71 q71Var) {
            this(builder);
        }

        @de1
        public static /* synthetic */ void getReceipt$annotations() {
        }
    }
}
