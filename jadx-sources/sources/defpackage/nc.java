package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ nc(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.x) {
            case 0:
                oc ocVar = (oc) this.y;
                Context context = view.getContext();
                if (!ocVar.c) {
                    context.getApplicationContext().registerComponentCallbacks(ocVar.d);
                    ocVar.c = true;
                    return;
                }
                return;
            case 1:
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ni5<Object> u22Var;
        Boolean bool;
        boolean z;
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                oc ocVar = (oc) obj;
                Context context = view.getContext();
                if (ocVar.c) {
                    context.getApplicationContext().unregisterComponentCallbacks(ocVar.d);
                    ocVar.c = false;
                    return;
                }
                return;
            case 1:
                q0 q0Var = (q0) obj;
                ViewParent parent = q0Var.getParent();
                tv6 tv6Var = tv6.x;
                if (parent == null) {
                    u22Var = st1.a;
                } else {
                    u22Var = new u22(new nj4(parent, (byte) 17), tv6Var, (byte) 2);
                }
                for (Object obj2 : u22Var) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        if (tag instanceof Boolean) {
                            bool = (Boolean) tag;
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                    }
                }
                q0Var.e();
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((bx5) obj).l(null);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
