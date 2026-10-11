package defpackage;

import android.database.SQLException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class l40 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ l40(fw0 fw0Var, boolean z) {
        this.x = (byte) 1;
        this.z = fw0Var;
        this.y = z;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        String str;
        t44 i;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj = this.z;
        boolean z = this.y;
        switch (b) {
            case 0:
                t44 t44Var = (t44) obj;
                if (z) {
                    t44Var.d(pn6Var);
                }
                return pn6Var;
            case 1:
                fw0 fw0Var = (fw0) obj;
                if (z) {
                    str = "reader";
                } else {
                    str = "writer";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                fw0Var.y.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                fw0Var.x.d(sb);
                try {
                    zz.c0(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return pn6Var;
                }
            default:
                tc tcVar = (tc) obj;
                if (z && (i = tcVar.i()) != null) {
                    ((in5) i).d(pn6Var);
                }
                return pn6Var;
        }
    }

    public /* synthetic */ l40(byte b, Object obj, boolean z) {
        this.x = b;
        this.y = z;
        this.z = obj;
    }
}
