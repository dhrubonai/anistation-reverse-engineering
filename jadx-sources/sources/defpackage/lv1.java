package defpackage;

import android.database.SQLException;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lv1 {
    public final kv1 a;
    public final jv1 b;

    public lv1(kv1 kv1Var, jv1 jv1Var) {
        this.a = kv1Var;
        this.b = jv1Var;
    }

    public static void a(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message != null) {
            if (!uz5.M(message, "unique", true) && !uz5.M(message, "2067", false) && !uz5.M(message, "1555", false)) {
                throw sQLException;
            }
            return;
        }
        throw sQLException;
    }

    public final void b(g85 g85Var, List list) {
        if (list != null) {
            for (Object obj : list) {
                try {
                    this.a.insert(g85Var, obj);
                } catch (SQLException e) {
                    a(e);
                    this.b.handle(g85Var, obj);
                }
            }
        }
    }
}
