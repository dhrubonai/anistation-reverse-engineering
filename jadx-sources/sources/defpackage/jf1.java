package defpackage;

import com.anistation.model.Resource;
import com.anistation.model.library.AnimeListItem;
import com.anistation.model.library.WatchProgress;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jf1 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ pf1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf1(pf1 pf1Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = pf1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        pf1 pf1Var = this.z;
        switch (b) {
            case 0:
                jf1 jf1Var = new jf1(pf1Var, vz0Var, (byte) 0);
                jf1Var.y = obj;
                return jf1Var;
            case 1:
                jf1 jf1Var2 = new jf1(pf1Var, vz0Var, (byte) 1);
                jf1Var2.y = obj;
                return jf1Var2;
            case 2:
                jf1 jf1Var3 = new jf1(pf1Var, vz0Var, (byte) 2);
                jf1Var3.y = obj;
                return jf1Var3;
            default:
                jf1 jf1Var4 = new jf1(pf1Var, vz0Var, (byte) 3);
                jf1Var4.y = obj;
                return jf1Var4;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((jf1) create((Resource) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((jf1) create((List) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                ((jf1) create((WatchProgress) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((jf1) create((AnimeListItem) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        zm6 zm6Var;
        String str;
        Integer num;
        Object value4;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        pf1 pf1Var = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                Resource resource = (Resource) obj2;
                m37.N(obj);
                sx5 sx5Var = pf1Var.f;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, zm6.a((zm6) value, null, resource, null, null, null, null, false, 125)));
                return pn6Var;
            case 1:
                List list = (List) obj2;
                m37.N(obj);
                sx5 sx5Var2 = pf1Var.f;
                do {
                    value2 = sx5Var2.getValue();
                } while (!sx5Var2.j(value2, zm6.a((zm6) value2, null, null, null, null, list, null, false, 111)));
                return pn6Var;
            case 2:
                WatchProgress watchProgress = (WatchProgress) obj2;
                m37.N(obj);
                sx5 sx5Var3 = pf1Var.f;
                do {
                    value3 = sx5Var3.getValue();
                    zm6Var = (zm6) value3;
                    if (watchProgress != null) {
                        str = watchProgress.getEpisodeTitle();
                    } else {
                        str = null;
                    }
                    if (watchProgress != null) {
                        num = new Integer(watchProgress.getEpisodeNumber());
                    } else {
                        num = null;
                    }
                } while (!sx5Var3.j(value3, zm6.a(zm6Var, null, null, str, num, null, null, false, 115)));
                return pn6Var;
            default:
                AnimeListItem animeListItem = (AnimeListItem) obj2;
                m37.N(obj);
                sx5 sx5Var4 = pf1Var.f;
                do {
                    value4 = sx5Var4.getValue();
                } while (!sx5Var4.j(value4, zm6.a((zm6) value4, null, null, null, null, null, animeListItem, false, 95)));
                return pn6Var;
        }
    }
}
