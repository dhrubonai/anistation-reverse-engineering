package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class is0 {
    public final List a;
    public final List b;
    public final List c;
    public List d;
    public List e;
    public final d46 f;
    public final d46 g;

    public is0(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        final byte b = 0;
        this.f = new d46(new sb2(this) { // from class: gs0
            public final /* synthetic */ is0 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b2 = b;
                nt1 nt1Var = nt1.x;
                int i = 0;
                is0 is0Var = this.y;
                switch (b2) {
                    case 0:
                        List list6 = is0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            dp0.Y((List) ((sb2) list6.get(i)).invoke(), arrayList);
                            i++;
                        }
                        is0Var.d = nt1Var;
                        return arrayList;
                    default:
                        List list7 = is0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            dp0.Y((List) ((sb2) list7.get(i)).invoke(), arrayList2);
                            i++;
                        }
                        is0Var.e = nt1Var;
                        return arrayList2;
                }
            }
        });
        final byte b2 = 1;
        this.g = new d46(new sb2(this) { // from class: gs0
            public final /* synthetic */ is0 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b22 = b2;
                nt1 nt1Var = nt1.x;
                int i = 0;
                is0 is0Var = this.y;
                switch (b22) {
                    case 0:
                        List list6 = is0Var.d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        while (i < size) {
                            dp0.Y((List) ((sb2) list6.get(i)).invoke(), arrayList);
                            i++;
                        }
                        is0Var.d = nt1Var;
                        return arrayList;
                    default:
                        List list7 = is0Var.e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        while (i < size2) {
                            dp0.Y((List) ((sb2) list7.get(i)).invoke(), arrayList2);
                            i++;
                        }
                        is0Var.e = nt1Var;
                        return arrayList2;
                }
            }
        });
    }
}
