package h8;

import android.util.Log;

/* loaded from: classes.dex */
public final class a implements l4.e {
    public final void a(x3.a0 a0Var, Object obj) {
        String str;
        StringBuilder sb = new StringBuilder("avatar failed: ");
        sb.append(obj);
        sb.append(" : ");
        if (a0Var != null) {
            str = a0Var.getMessage();
        } else {
            str = "null";
        }
        sb.append(str);
        Log.e("CastAdapter", sb.toString());
    }
}
