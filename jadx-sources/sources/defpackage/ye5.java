package defpackage;

import com.anistation.model.Anime;
import com.anistation.model.Page;
import com.anistation.model.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ye5 extends t36 implements ic2 {
    public /* synthetic */ Object x;
    public final /* synthetic */ af5 y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye5(af5 af5Var, String str, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = af5Var;
        this.z = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        ye5 ye5Var = new ye5(this.y, this.z, vz0Var);
        ye5Var.x = obj;
        return ye5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ye5 ye5Var = (ye5) create((Resource) obj, (vz0) obj2);
        pn6 pn6Var = pn6.a;
        ye5Var.invokeSuspend(pn6Var);
        return pn6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Page page;
        Object value3;
        Resource resource = (Resource) this.x;
        m37.N(obj);
        af5 af5Var = this.y;
        sx5 sx5Var = af5Var.d;
        String h = h98.h(((wm6) sx5Var.getValue()).b);
        String str = this.z;
        if (h.equals(str)) {
            if (resource != null) {
                if (resource instanceof Resource.Success) {
                    Page page2 = (Page) ((Resource.Success) resource).getData();
                    if (page2 != null) {
                        List results = page2.getResults();
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : results) {
                            Anime anime = (Anime) obj2;
                            if (hashSet.add(vc2.a(anime.getAnilistId(), anime.getId()))) {
                                arrayList.add(obj2);
                            }
                        }
                        page = Page.copy$default(page2, 0, 0, false, null, arrayList, 15, null);
                    } else {
                        page = new Page(1, 20, false, new Integer(0), nt1.x);
                    }
                    af5Var.k.put(str, page);
                    do {
                        value3 = sx5Var.getValue();
                    } while (!sx5Var.j(value3, wm6.a((wm6) value3, null, null, false, false, page, null, false, null, null, 491)));
                } else {
                    if (!(resource instanceof Resource.Error)) {
                        if ((resource instanceof Resource.Loading) || (resource instanceof Resource.Idle)) {
                            do {
                                value = sx5Var.getValue();
                            } while (!sx5Var.j(value, wm6.a((wm6) value, null, null, true, false, null, null, false, null, null, 1019)));
                        }
                    }
                    do {
                        value2 = sx5Var.getValue();
                    } while (!sx5Var.j(value2, wm6.a((wm6) value2, null, null, false, false, null, null, false, null, ((Resource.Error) resource).getMessage(), 491)));
                }
            }
            ze0.l();
            return null;
        }
        return pn6.a;
    }
}
