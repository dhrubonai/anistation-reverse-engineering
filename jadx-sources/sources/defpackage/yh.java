package defpackage;

import android.view.View;
import com.anistation.download.service.ExternalDownloadService;
import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.download.DownloadAnimeGroup;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.anistation.model.settings.HoldAction;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.model.settings.ThemeMode;
import com.anistation.model.watch.WatchSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yh extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh(byte b, vz0 vz0Var, Object obj, Object obj2, boolean z) {
        super(2, vz0Var);
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return new yh((String) this.z, (w44) obj2, vz0Var, (byte) 0);
            case 1:
                return new yh((byte) 1, vz0Var, (w44) obj2, (w44) this.z, false);
            case 2:
                yh yhVar = new yh((wc0) obj2, vz0Var, (byte) 2);
                yhVar.z = obj;
                return yhVar;
            case 3:
                yh yhVar2 = new yh((j31) obj2, vz0Var, (byte) 3);
                yhVar2.z = obj;
                return yhVar2;
            case 4:
                yh yhVar3 = new yh((ox5) obj2, vz0Var, (byte) 4);
                yhVar3.z = obj;
                return yhVar3;
            case 5:
                return new yh((DownloadAnimeGroup) this.z, (sb2) obj2, vz0Var, (byte) 5);
            case 6:
                yh yhVar4 = new yh((oa0) obj2, vz0Var, (byte) 6);
                yhVar4.z = obj;
                return yhVar4;
            case 7:
                return new yh((byte) 7, vz0Var, (ExternalDownloadService) obj2, (String) this.z, false);
            case 8:
                yh yhVar5 = new yh((nf2) obj2, vz0Var, (byte) 8);
                yhVar5.z = obj;
                return yhVar5;
            case 9:
                yh yhVar6 = new yh((HoldAction) obj2, vz0Var, (byte) 9);
                yhVar6.z = obj;
                return yhVar6;
            case 10:
                yh yhVar7 = new yh((ThemeMode) obj2, vz0Var, (byte) 10);
                yhVar7.z = obj;
                return yhVar7;
            case 11:
                yh yhVar8 = new yh((rn2) obj2, vz0Var, (byte) 11);
                yhVar8.z = obj;
                return yhVar8;
            case 12:
                yh yhVar9 = new yh((sb2) obj2, vz0Var, (byte) 12);
                yhVar9.z = obj;
                return yhVar9;
            case 13:
                yh yhVar10 = new yh((gg3) obj2, vz0Var, (byte) 13);
                yhVar10.z = obj;
                return yhVar10;
            case 14:
                yh yhVar11 = new yh((bp3) obj2, vz0Var, (byte) 14);
                yhVar11.z = obj;
                return yhVar11;
            case 15:
                yh yhVar12 = new yh((b64) obj2, vz0Var, (byte) 15);
                yhVar12.z = obj;
                return yhVar12;
            case 16:
                return new yh((ArrayList) this.z, (zt5) obj2, vz0Var, (byte) 16);
            case 17:
                return new yh((hp4) this.z, (w44) obj2, vz0Var, (byte) 17);
            case 18:
                return new yh((View) this.z, (ic2) obj2, vz0Var, (byte) 18);
            case 19:
                return new yh((gt0) this.z, (eg3) obj2, vz0Var, (byte) 19);
            case 20:
                yh yhVar13 = new yh((ic2) obj2, vz0Var, (byte) 20);
                yhVar13.z = obj;
                return yhVar13;
            case 21:
                return new yh((wm6) this.z, (ic6) obj2, vz0Var, (byte) 21);
            case 22:
                yh yhVar14 = new yh((af5) obj2, vz0Var, (byte) 22);
                yhVar14.z = obj;
                return yhVar14;
            case 23:
                return new yh((byte) 23, vz0Var, (hm5) obj2, (String) this.z, false);
            case 24:
                return new yh((SubtitleStyleSettings) this.z, (w44) obj2, vz0Var, (byte) 24);
            case 25:
                yh yhVar15 = new yh((cc6) obj2, vz0Var, (byte) 25);
                yhVar15.z = obj;
                return yhVar15;
            case 26:
                yh yhVar16 = new yh((SubtitleStyleSettings) obj2, vz0Var, (byte) 26);
                yhVar16.z = obj;
                return yhVar16;
            case 27:
                return new yh((ub2) this.z, (WatchSession) obj2, vz0Var, (byte) 27);
            default:
                return new yh((n80) this.z, (w44) obj2, vz0Var, (byte) 28);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                return ((yh) create(obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((yh) create((ox5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 6:
                ((yh) create((ae0) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 7:
                return ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                ((yh) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 9:
                ((yh) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 10:
                ((yh) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 11:
                ((yh) create((List) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 12:
                return ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 14:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                throw null;
            case 15:
                ((yh) create((List) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 16:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 17:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 18:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 19:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 20:
                return ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 21:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 22:
                ((yh) create((List) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 23:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 24:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 25:
                return ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 26:
                ((yh) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 27:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((yh) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [iy4, java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [vz0] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        LinkedHashSet linkedHashSet;
        Object value;
        Unsafe unsafe;
        long j;
        int intVolatile;
        Object value2;
        ko4 ko4Var;
        Object value3;
        byte b = this.x;
        byte b2 = 22;
        byte b3 = 2;
        boolean z = false;
        byte b4 = 3;
        byte b5 = 1;
        String str3 = 0;
        String str4 = null;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                String str5 = (String) this.z;
                w44 w44Var = (w44) obj2;
                if (!a34.i(str5, ((mc6) w44Var.getValue()).a.y)) {
                    mc6 mc6Var = (mc6) w44Var.getValue();
                    int length = str5.length();
                    w44Var.setValue(new mc6(new ko(str5), fy5.a(length, length), mc6Var.c));
                }
                return pn6Var;
            case 1:
                m37.N(obj);
                List list = sj.a;
                i46 i46Var = (i46) ((w44) obj2).getValue();
                if (i46Var != null) {
                    ((w44) this.z).setValue(i46Var);
                }
                return pn6Var;
            case 2:
                Object obj3 = this.z;
                m37.N(obj);
                if (obj3 != null || ((wc0) obj2).h()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                m37.N(obj);
                v11 v11Var = (v11) this.z;
                j31 j31Var = (j31) obj2;
                AtomicReference atomicReference = j31Var.b;
                bx5 z2 = tl7.z(v11Var, null, null, new q8((h43) atomicReference.getAndSet(null), j31Var, str3, b4), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, z2)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                m37.N(obj);
                ox5 ox5Var = (ox5) this.z;
                if ((ox5Var instanceof f41) && ((f41) ox5Var).a <= ((f41) ((ox5) obj2)).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                m37.N(obj);
                if (((DownloadAnimeGroup) this.z) == null) {
                    ((sb2) obj2).invoke();
                }
                return pn6Var;
            case 6:
                ae0 ae0Var = (ae0) this.z;
                m37.N(obj);
                qq5 e = ae0Var.e();
                oa0 oa0Var = (oa0) obj2;
                ?? obj4 = new Object();
                if (oa0Var.z != 0) {
                    yf5 yf5Var = oa0Var.x;
                    yf5Var.getClass();
                    yf5 f = yf5Var.f();
                    obj4.x = f;
                    obj4.y = f;
                    for (yf5 yf5Var2 = yf5Var.f; yf5Var2 != null; yf5Var2 = yf5Var2.f) {
                        yf5 yf5Var3 = obj4.y;
                        yf5Var3.getClass();
                        yf5 f2 = yf5Var2.f();
                        yf5Var3.e(f2);
                        obj4.y = f2;
                    }
                    obj4.z = oa0Var.z;
                }
                ((oa0) e).G(obj4);
                return pn6Var;
            case 7:
                m37.N(obj);
                ExternalDownloadService externalDownloadService = (ExternalDownloadService) obj2;
                int i = ExternalDownloadService.R;
                i02 h = externalDownloadService.h();
                String str6 = (String) this.z;
                ExternalDownloadRecord c = h.c(str6);
                x02 g = externalDownloadService.g();
                if (c != null) {
                    str = c.getVideoUri();
                } else {
                    str = null;
                }
                g.b(str);
                x02 g2 = externalDownloadService.g();
                if (c != null) {
                    str3 = c.getSubtitleUri();
                }
                g2.b(str3);
                Iterator it = externalDownloadService.p(str6).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                return externalDownloadService.h().e(str6);
            case 8:
                j44 j44Var = (j44) this.z;
                m37.N(obj);
                hh2.d.getClass();
                ts4 ts4Var = hh2.f;
                nf2 nf2Var = (nf2) obj2;
                Boolean bool = nf2Var.a;
                if (bool == null) {
                    j44Var.d(ts4Var);
                } else {
                    j44Var.e(ts4Var, bool);
                }
                ts4 ts4Var2 = hh2.g;
                Boolean bool2 = nf2Var.b;
                if (bool2 == null) {
                    j44Var.d(ts4Var2);
                } else {
                    j44Var.e(ts4Var2, bool2);
                }
                ts4 ts4Var3 = hh2.i;
                Boolean bool3 = nf2Var.c;
                if (bool3 == null) {
                    j44Var.d(ts4Var3);
                } else {
                    j44Var.e(ts4Var3, bool3);
                }
                ts4 ts4Var4 = hh2.j;
                Boolean bool4 = nf2Var.d;
                if (bool4 == null) {
                    j44Var.d(ts4Var4);
                } else {
                    j44Var.e(ts4Var4, bool4);
                }
                ts4 ts4Var5 = hh2.k;
                Boolean bool5 = nf2Var.e;
                if (bool5 == null) {
                    j44Var.d(ts4Var5);
                } else {
                    j44Var.e(ts4Var5, bool5);
                }
                ts4 ts4Var6 = hh2.l;
                HoldAction holdAction = nf2Var.f;
                if (holdAction != null) {
                    str2 = holdAction.name();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    j44Var.d(ts4Var6);
                } else {
                    j44Var.e(ts4Var6, str2);
                }
                ts4 ts4Var7 = hh2.m;
                Boolean bool6 = nf2Var.g;
                if (bool6 == null) {
                    j44Var.d(ts4Var7);
                } else {
                    j44Var.e(ts4Var7, bool6);
                }
                ts4 ts4Var8 = hh2.n;
                Boolean bool7 = nf2Var.h;
                if (bool7 == null) {
                    j44Var.d(ts4Var8);
                } else {
                    j44Var.e(ts4Var8, bool7);
                }
                ts4 ts4Var9 = hh2.q;
                String str7 = nf2Var.i;
                if (str7 == null) {
                    j44Var.d(ts4Var9);
                } else {
                    j44Var.e(ts4Var9, str7);
                }
                ts4 ts4Var10 = hh2.r;
                String str8 = nf2Var.j;
                if (str8 == null) {
                    j44Var.d(ts4Var10);
                } else {
                    j44Var.e(ts4Var10, str8);
                }
                ts4 ts4Var11 = hh2.s;
                Set set = nf2Var.k;
                if (set != null) {
                    linkedHashSet = new LinkedHashSet();
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(((WatchStatus) it2.next()).name());
                    }
                } else {
                    linkedHashSet = null;
                }
                if (linkedHashSet == null) {
                    j44Var.d(ts4Var11);
                } else {
                    j44Var.e(ts4Var11, linkedHashSet);
                }
                hh2.d.getClass();
                ts4 ts4Var12 = hh2.h;
                ThemeMode themeMode = nf2Var.l;
                if (themeMode != null) {
                    str4 = themeMode.name();
                }
                if (str4 == null) {
                    j44Var.d(ts4Var12);
                } else {
                    j44Var.e(ts4Var12, str4);
                }
                return pn6Var;
            case 9:
                j44 j44Var2 = (j44) this.z;
                m37.N(obj);
                hh2.d.getClass();
                j44Var2.e(hh2.l, ((HoldAction) obj2).name());
                return pn6Var;
            case 10:
                j44 j44Var3 = (j44) this.z;
                m37.N(obj);
                hh2.d.getClass();
                j44Var3.e(hh2.h, ((ThemeMode) obj2).name());
                return pn6Var;
            case 11:
                List list2 = (List) this.z;
                m37.N(obj);
                sx5 sx5Var = ((rn2) obj2).e;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, tm6.a((tm6) value, null, null, 0, null, list2, false, 47)));
                return pn6Var;
            case 12:
                v11 v11Var2 = (v11) this.z;
                m37.N(obj);
                l11 coroutineContext = v11Var2.getCoroutineContext();
                sb2 sb2Var = (sb2) obj2;
                try {
                    re6 re6Var = new re6();
                    re6Var.C = h98.A(h98.w(coroutineContext), true, re6Var);
                    try {
                        do {
                            unsafe = qs.a;
                            j = re6.D;
                            intVolatile = unsafe.getIntVolatile(re6Var, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    re6.n(intVolatile);
                                    throw null;
                                }
                            }
                            return sb2Var.invoke();
                        } while (!unsafe.compareAndSwapInt(re6Var, j, intVolatile, 0));
                        return sb2Var.invoke();
                    } finally {
                        re6Var.m();
                    }
                } catch (InterruptedException e2) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
                }
            case 13:
                m37.N(obj);
                v11 v11Var3 = (v11) this.z;
                gg3 gg3Var = (gg3) obj2;
                fg3 fg3Var = gg3Var.x;
                if (((rg3) fg3Var).i.compareTo(eg3.y) >= 0) {
                    fg3Var.a(gg3Var);
                } else {
                    h98.i(v11Var3.getCoroutineContext(), null);
                }
                return pn6Var;
            case 14:
                m37.N(obj);
                throw null;
            case 15:
                List list3 = (List) this.z;
                m37.N(obj);
                sx5 sx5Var2 = ((b64) obj2).c;
                do {
                    value2 = sx5Var2.getValue();
                } while (!sx5Var2.j(value2, um6.a((um6) value2, list3, null, false, 2)));
                return pn6Var;
            case 16:
                m37.N(obj);
                ArrayList arrayList = (ArrayList) this.z;
                zt5 zt5Var = (zt5) obj2;
                if (arrayList.size() > 0) {
                    if (arrayList.get(0) == null) {
                        zt5Var.getClass();
                        n2 n2Var = n03.v(zt5Var).c;
                        new ArrayList(n2Var.b());
                        if (n2Var.b() > 0) {
                            n2Var.get(0).getClass();
                            ov3.d();
                            return null;
                        }
                        throw null;
                    }
                    ov3.d();
                    return null;
                }
                return pn6Var;
            case 17:
                m37.N(obj);
                hp4 hp4Var = (hp4) this.z;
                if (hp4Var != null) {
                    ((w44) obj2).setValue(hp4Var);
                }
                return pn6Var;
            case 18:
                m37.N(obj);
                View view = (View) this.z;
                Object tag = view.getTag();
                if (tag instanceof ko4) {
                    ko4Var = (ko4) tag;
                } else {
                    ko4Var = null;
                }
                if (ko4Var != null) {
                    ic2 ic2Var = (ic2) obj2;
                    if (ko4Var.t0(27)) {
                        ic2Var.invoke(ko4Var, view);
                    }
                    view.setTag(null);
                }
                return pn6Var;
            case 19:
                m37.N(obj);
                gt0 gt0Var = (gt0) this.z;
                gt0Var.z = (eg3) obj2;
                gt0Var.a();
                return pn6Var;
            case 20:
                m37.N(obj);
                j11 j11Var = ((v11) this.z).getCoroutineContext().get(h95.B);
                j11Var.getClass();
                n11 n11Var = (n11) j11Var;
                zq0 c2 = tl7.c();
                tl7.y(jf2.x, n11Var, y11.A, new e05(c2, (ic2) obj2, (vz0) str3, b5));
                while (!c2.k0()) {
                    try {
                        return bx7.K(n11Var, new hu1(c2, str3, b2));
                    } catch (InterruptedException unused) {
                    }
                }
                return c2.C();
            case 21:
                m37.N(obj);
                wm6 wm6Var = (wm6) this.z;
                ic6 ic6Var = (ic6) obj2;
                if (!a34.i(wm6Var.a, ic6Var.c().A.toString())) {
                    yu5.l(ic6Var, wm6Var.a);
                }
                return pn6Var;
            case 22:
                List list4 = (List) this.z;
                m37.N(obj);
                sx5 sx5Var3 = ((af5) obj2).d;
                do {
                    value3 = sx5Var3.getValue();
                } while (!sx5Var3.j(value3, wm6.a((wm6) value3, null, null, false, false, null, null, false, list4, null, 639)));
                return pn6Var;
            case 23:
                m37.N(obj);
                hm5 hm5Var = (hm5) obj2;
                tl7.z(zz.J(hm5Var), null, null, new q8(hm5Var, new zg((String) this.z, b2), str3, (byte) 11), 3);
                return pn6Var;
            case 24:
                m37.N(obj);
                SubtitleStyleSettings normalized = ((SubtitleStyleSettings) this.z).normalized();
                List list5 = h26.a;
                ((w44) obj2).setValue(normalized);
                return pn6Var;
            case 25:
                m37.N(obj);
                v11 v11Var4 = (v11) this.z;
                cc6 cc6Var = (cc6) obj2;
                tl7.z(v11Var4, null, null, new ea6(cc6Var, str3, b5), 3);
                return tl7.z(v11Var4, null, null, new ea6(cc6Var, str3, b3), 3);
            case 26:
                j44 j44Var4 = (j44) this.z;
                m37.N(obj);
                ts4 ts4Var13 = av6.b;
                SubtitleStyleSettings subtitleStyleSettings = (SubtitleStyleSettings) obj2;
                j44Var4.e(av6.l, new Float(subtitleStyleSettings.getFontScale()));
                j44Var4.e(av6.m, new Float(subtitleStyleSettings.getVerticalPosition()));
                j44Var4.e(av6.n, new Float(subtitleStyleSettings.getOutlineWidthDp()));
                j44Var4.e(av6.o, new Integer(subtitleStyleSettings.getTextColorArgb()));
                j44Var4.e(av6.p, new Integer(subtitleStyleSettings.getOutlineColorArgb()));
                j44Var4.e(av6.q, subtitleStyleSettings.getFontFamily().getId());
                j44Var4.e(av6.r, Boolean.valueOf(subtitleStyleSettings.isBold()));
                return pn6Var;
            case 27:
                m37.N(obj);
                ((ub2) this.z).invoke((WatchSession) obj2);
                return pn6Var;
            default:
                m37.N(obj);
                if (((n80) this.z).a.c() == eo5.x) {
                    ((w44) obj2).setValue(Boolean.FALSE);
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.y = obj2;
    }
}
