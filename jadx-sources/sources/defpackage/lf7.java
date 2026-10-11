package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lf7 implements sg7 {
    public final mf7 a;

    static {
        ff7 ff7Var = ff7.a;
        int i = se7.a;
    }

    public lf7(mf7 mf7Var) {
        this.a = mf7Var;
    }

    public final mf7 a(InputStream inputStream, ff7 ff7Var) {
        ze7 h = ze7.h(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE);
        int i = mf7.zzd;
        mf7 g = this.a.g();
        try {
            xg7 a = ug7.c.a(g.getClass());
            fm0 fm0Var = h.c;
            if (fm0Var == null) {
                fm0Var = new fm0(h);
            }
            a.j(g, fm0Var, ff7Var);
            a.f(g);
            h.m(0);
            if (mf7.o(g, true)) {
                return g;
            }
            throw new bh7().a();
        } catch (ag7 e) {
            if (e.x) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (bh7 e2) {
            throw e2.a();
        } catch (IOException e3) {
            if (e3.getCause() instanceof ag7) {
                throw ((ag7) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ag7) {
                throw ((ag7) e4.getCause());
            }
            throw e4;
        }
    }
}
