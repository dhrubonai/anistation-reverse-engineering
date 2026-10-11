package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class z83 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Context y;

    public /* synthetic */ z83(Context context, byte b) {
        this.x = b;
        this.y = context;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        final Context context = this.y;
        switch (b) {
            case 0:
                e04 e04Var = (e04) obj;
                e04Var.getClass();
                boolean z = context instanceof Application;
                v83 v83Var = v83.x;
                if (z) {
                    final byte b2 = 0;
                    ic2 ic2Var = new ic2() { // from class: a93
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b3 = b2;
                            Context context2 = context;
                            dc5 dc5Var = (dc5) obj2;
                            li4 li4Var = (li4) obj3;
                            switch (b3) {
                                case 0:
                                    dc5Var.getClass();
                                    li4Var.getClass();
                                    return (Application) context2;
                                default:
                                    dc5Var.getClass();
                                    li4Var.getClass();
                                    return context2;
                            }
                        }
                    };
                    kz5 kz5Var = zp2.C;
                    r50 r50Var = new r50(kz5Var, z05.a(Application.class), null, ic2Var, v83Var);
                    k03 k03Var = new k03(r50Var);
                    e04Var.a(k03Var);
                    im0 a = z05.a(Context.class);
                    r50Var.f.add(a);
                    e04Var.c.put(f73.a(a) + "::" + kz5Var, k03Var);
                } else {
                    final byte b3 = 1;
                    e04Var.a(new k03(new r50(zp2.C, z05.a(Context.class), null, new ic2() { // from class: a93
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b32 = b3;
                            Context context2 = context;
                            dc5 dc5Var = (dc5) obj2;
                            li4 li4Var = (li4) obj3;
                            switch (b32) {
                                case 0:
                                    dc5Var.getClass();
                                    li4Var.getClass();
                                    return (Application) context2;
                                default:
                                    dc5Var.getClass();
                                    li4Var.getClass();
                                    return context2;
                            }
                        }
                    }, v83Var)));
                }
                return pn6Var;
            case 1:
                ((ci1) obj).getClass();
                return new qj(iv.u(context), context, (byte) 10);
            default:
                String str = (String) obj;
                str.getClass();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", "Check out this anime on AniStation: https://anistation.top/anime/".concat(str));
                context.startActivity(Intent.createChooser(intent, "Share Anime"));
                return pn6Var;
        }
    }
}
