package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class ke6 {
    public static final ni1 a = new ni1("NO_THREAD_ELEMENTS", (byte) 2);
    public static final ao5 b = new ao5(3);
    public static final ao5 c = new ao5(4);
    public static final ao5 d = new ao5(5);

    public static final void a(l11 l11Var, Object obj) {
        if (obj != a) {
            if (obj instanceof qe6) {
                qe6 qe6Var = (qe6) obj;
                le6[] le6VarArr = qe6Var.c;
                int length = le6VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    le6 le6Var = le6VarArr[length];
                    le6Var.getClass();
                    le6Var.a(qe6Var.b[length]);
                    if (i >= 0) {
                        length = i;
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = l11Var.fold(null, c);
                fold.getClass();
                ((le6) fold).a(obj);
            }
        }
    }

    public static final Object b(l11 l11Var) {
        Object fold = l11Var.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object c(l11 l11Var, Object obj) {
        if (obj == null) {
            obj = b(l11Var);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return l11Var.fold(new qe6(((Number) obj).intValue(), l11Var), d);
        }
        return ((le6) obj).b();
    }
}
