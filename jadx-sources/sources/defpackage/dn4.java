package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class dn4 {
    public static final tq1 a = new tq1(new qa4((byte) 8), (byte) 1);
    public static final cn4 b = new Object();

    public static final void a(n86 n86Var, Context context, boolean z, CharSequence charSequence, nd6 nd6Var, bn4 bn4Var, ub2 ub2Var) {
        if (charSequence != null && nd6Var != null && bn4Var != null) {
            long j = nd6Var.a;
            Object obj = bn4Var.h;
            m54 m54Var = bn4Var.e;
            l86 l86Var = null;
            if (m54Var.f()) {
                l86 l86Var2 = (l86) bn4Var.g.getValue();
                if (l86Var2 == null || !nd6.c(j, l86Var2.b) || !a34.i(charSequence, l86Var2.a)) {
                    l86Var2 = null;
                }
                m54Var.l(null);
                l86Var = l86Var2;
            }
            if (l86Var == null) {
                ub2Var.invoke(n86Var);
            } else {
                ArrayList arrayList = l86Var.d;
                TextClassification textClassification = l86Var.c;
                if (!textClassification.getActions().isEmpty()) {
                    n86Var.a.a(new c96(obj, textClassification, 0, (Drawable) arrayList.get(0)));
                } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                    n86Var.a.a(new c96(obj, textClassification, -1, textClassification.getIcon()));
                }
                ub2Var.invoke(n86Var);
                List<RemoteAction> actions = textClassification.getActions();
                int size = actions.size();
                for (int i = 0; i < size; i++) {
                    actions.get(i);
                    if (i > 0) {
                        n86Var.a.a(new c96(obj, textClassification, i, (Drawable) arrayList.get(i)));
                    }
                }
            }
            wk6.g(n86Var, context, z, charSequence, nd6Var.a);
            return;
        }
        ub2Var.invoke(n86Var);
        if (charSequence != null && nd6Var != null) {
            wk6.g(n86Var, context, z, charSequence, nd6Var.a);
        }
    }

    public static final bn4 b(fk3 fk3Var, kd2 kd2Var) {
        kd2Var.e0(430530635);
        Context context = (Context) kd2Var.j(eb.b);
        l11 l11Var = (l11) kd2Var.j(a);
        boolean f = kd2Var.f(l11Var) | kd2Var.f(context) | kd2Var.f(fk3Var);
        Object Q = kd2Var.Q();
        if (f || Q == au0.a) {
            b.getClass();
            Q = new bn4(l11Var, context, wg5.x, fk3Var);
            kd2Var.n0(Q);
        }
        bn4 bn4Var = (bn4) Q;
        kd2Var.q(false);
        return bn4Var;
    }
}
