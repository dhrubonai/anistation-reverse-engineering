package com.anistation.model;

import defpackage.a34;
import defpackage.q71;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface Resource<T> {

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Idle implements Resource {
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Idle)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1793894746;
        }

        public String toString() {
            return "Idle";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Loading implements Resource {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Loading)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -967933654;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Success<T> implements Resource<T> {
        private final T data;

        public Success(T t) {
            this.data = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Success<T> copy(T t) {
            return new Success<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Success) && a34.i(this.data, ((Success) obj).data)) {
                return true;
            }
            return false;
        }

        public final T getData() {
            return this.data;
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.data + ")";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Error implements Resource {
        private final String message;
        private final Status status;

        public Error(String str, Status status) {
            status.getClass();
            this.message = str;
            this.status = status;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, Status status, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                status = error.status;
            }
            return error.copy(str, status);
        }

        public final String component1() {
            return this.message;
        }

        public final Status component2() {
            return this.status;
        }

        public final Error copy(String str, Status status) {
            status.getClass();
            return new Error(str, status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (a34.i(this.message, error.message) && this.status == error.status) {
                return true;
            }
            return false;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode;
            String str = this.message;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.status.hashCode() + (hashCode * 31);
        }

        public String toString() {
            return "Error(message=" + this.message + ", status=" + this.status + ")";
        }

        public /* synthetic */ Error(String str, Status status, int i, q71 q71Var) {
            this((i & 1) != 0 ? null : str, status);
        }
    }
}
