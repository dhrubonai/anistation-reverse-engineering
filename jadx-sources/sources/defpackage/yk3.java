package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface yk3 {
    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    void f(String str, Throwable th);

    void g(String str);

    void h(String str);

    default boolean i(int i) {
        char c;
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            c = 0;
                        } else {
                            throw null;
                        }
                    } else {
                        c = '\n';
                    }
                } else {
                    c = 20;
                }
            } else {
                c = 30;
            }
        } else {
            c = '(';
        }
        if (c != 0) {
            if (c != '\n') {
                if (c != 20) {
                    if (c != 30) {
                        if (c == '(') {
                            return c();
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i != 5) {
                                            str = "null";
                                        } else {
                                            str = "TRACE";
                                        }
                                    } else {
                                        str = "DEBUG";
                                    }
                                } else {
                                    str = "INFO";
                                }
                            } else {
                                str = "WARN";
                            }
                        } else {
                            str = "ERROR";
                        }
                        throw new IllegalArgumentException("Level [" + str + "] not recognized.");
                    }
                    return a();
                }
                return d();
            }
            return b();
        }
        return e();
    }

    void info(String str);

    void trace(String str, Throwable th);
}
