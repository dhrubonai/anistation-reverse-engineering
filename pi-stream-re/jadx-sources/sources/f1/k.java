package f1;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import android.util.Pair;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.c0;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import j1.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.viewmodel.SearchViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3833d;

    public /* synthetic */ k(int i10, List list, t8.b bVar) {
        this.f3830a = 9;
        this.f3831b = i10;
        this.f3832c = list;
        this.f3833d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        List emptyList;
        long i10;
        String str;
        Object[] objArr;
        final int i11 = this.f3831b;
        int i12 = 0;
        boolean z9 = false;
        int i13 = this.f3830a;
        e0.j jVar = null;
        int i14 = 1;
        Object obj = this.f3833d;
        Object obj2 = this.f3832c;
        switch (i13) {
            case 0:
                l lVar = (l) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    if (!nVar.f3837d) {
                        if (i11 != -1) {
                            nVar.f3835b.a(i11);
                        }
                        nVar.f3836c = true;
                        lVar.invoke(nVar.f3834a);
                    }
                }
                return;
            case 1:
                Pair pair = (Pair) obj;
                ((k1.a0) ((a1) ((androidx.appcompat.widget.a0) obj2).f404c).f5626h).y(((Integer) pair.first).intValue(), (v1.w) pair.second, i11);
                return;
            case 2:
                o1.n nVar2 = (o1.n) obj2;
                o1.o oVar = (o1.o) obj;
                int i15 = nVar2.f8162a;
                oVar.P();
                oVar.y(i15, nVar2.f8163b, i11);
                return;
            case 3:
                ((k3.a) obj2).f6436b.l(i11, obj);
                return;
            case 4:
                ((k3.e) obj2).l(i11, obj);
                return;
            case 5:
                List list = (List) obj;
                TextView textView = ((h8.x) obj2).f5141w;
                if (textView != null) {
                    StringBuilder u9 = a3.g.u("Resolving ", i11, "/");
                    u9.append(list.size());
                    u9.append("…");
                    textView.setText(u9.toString());
                    return;
                }
                return;
            case 6:
                ((i8.f) obj2).f5434d = i11;
                MainActivity mainActivity = ((l8.x) obj).f7032b;
                mainActivity.T.clear();
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                mainActivity.S();
                                return;
                            }
                            return;
                        }
                        mainActivity.L();
                        return;
                    }
                    mainActivity.R();
                    return;
                }
                mainActivity.Q();
                return;
            case zzaja.zze.zzg /* 7 */:
                int i16 = l8.u.A0;
                ((l8.u) obj2).X(i11, (List) obj);
                return;
            case 8:
                Context context = (Context) obj2;
                final TextView textView2 = (TextView) obj;
                long j4 = 0;
                try {
                    j4 = 0 + z7.c.i(z7.c.b(context));
                } catch (Exception unused) {
                }
                try {
                    Uri p3 = com.bumptech.glide.c.p(context);
                    if (p3 != null) {
                        String treeDocumentId = DocumentsContract.getTreeDocumentId(p3);
                        if (DocumentsContract.isDocumentUri(context, p3)) {
                            treeDocumentId = DocumentsContract.getDocumentId(p3);
                        }
                        p0.a aVar = new p0.a(jVar, context, DocumentsContract.buildDocumentUriUsingTree(p3, treeDocumentId), i14);
                        e0.j[] l10 = aVar.l();
                        int length = l10.length;
                        while (true) {
                            if (i12 < length) {
                                e0.j jVar2 = l10[i12];
                                if ("Pi Stream Downloads".equals(jVar2.f())) {
                                    jVar = jVar2;
                                } else {
                                    i12++;
                                }
                            }
                        }
                        if (jVar != null) {
                            i10 = z7.c.w(jVar);
                        } else {
                            i10 = z7.c.w(aVar);
                        }
                    } else {
                        i10 = z7.c.i(new File(context.getExternalFilesDir(null), "Downloads"));
                    }
                    j4 += i10;
                } catch (Exception unused2) {
                }
                final long j10 = j4;
                try {
                    if (context instanceof Activity) {
                        final int i17 = 0;
                        ((Activity) context).runOnUiThread(new Runnable() { // from class: m8.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i18 = i17;
                                long j11 = j10;
                                int i19 = i11;
                                TextView textView3 = textView2;
                                switch (i18) {
                                    case 0:
                                        try {
                                            textView3.setText("Saved entries: " + i19 + "  •  disk used: " + com.bumptech.glide.c.r(j11));
                                            return;
                                        } catch (Exception unused3) {
                                            return;
                                        }
                                    default:
                                        try {
                                            textView3.setText("Saved entries: " + i19 + "  •  disk used: " + com.bumptech.glide.c.r(j11));
                                            return;
                                        } catch (Exception unused4) {
                                            return;
                                        }
                                }
                            }
                        });
                    } else {
                        final int i18 = 1;
                        textView2.post(new Runnable() { // from class: m8.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i182 = i18;
                                long j11 = j10;
                                int i19 = i11;
                                TextView textView3 = textView2;
                                switch (i182) {
                                    case 0:
                                        try {
                                            textView3.setText("Saved entries: " + i19 + "  •  disk used: " + com.bumptech.glide.c.r(j11));
                                            return;
                                        } catch (Exception unused3) {
                                            return;
                                        }
                                    default:
                                        try {
                                            textView3.setText("Saved entries: " + i19 + "  •  disk used: " + com.bumptech.glide.c.r(j11));
                                            return;
                                        } catch (Exception unused4) {
                                            return;
                                        }
                                }
                            }
                        });
                    }
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 9:
                List list2 = (List) obj2;
                t8.d dVar = (t8.d) obj;
                if (i11 >= 0 && i11 < list2.size()) {
                    t8.b bVar = (t8.b) dVar;
                    int i19 = bVar.f10098a;
                    PopupWindow popupWindow = bVar.f10100c;
                    f8.h hVar = bVar.f10099b;
                    switch (i19) {
                        case 0:
                            ((n8.a) hVar.f3961a).H(i11);
                            popupWindow.dismiss();
                            return;
                        default:
                            ((n8.a) hVar.f3961a).H(i11);
                            popupWindow.dismiss();
                            return;
                    }
                }
                return;
            case 10:
                x8.e eVar = (x8.e) obj2;
                List<a8.b> list3 = (List) obj;
                eVar.f11408i = false;
                eVar.f11403d.j(Boolean.FALSE);
                eVar.f11405f.j(null);
                c0 c0Var = eVar.f11404e;
                if (list3 != null && !list3.isEmpty()) {
                    ArrayList arrayList = eVar.f11410k;
                    int size = arrayList.size();
                    for (a8.b bVar2 : list3) {
                        if (bVar2 != null && (str = bVar2.f168a) != null && !str.trim().isEmpty()) {
                            String b10 = x8.e.b(bVar2);
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (x8.e.b((a8.b) it2.next()).equals(b10)) {
                                        objArr = true;
                                    }
                                } else {
                                    objArr = false;
                                }
                            }
                            if (objArr == false) {
                                arrayList.add(bVar2);
                            }
                        }
                    }
                    if (arrayList.size() == size) {
                        if (i11 > 1) {
                            z9 = true;
                        }
                        eVar.f11409j = z9;
                    } else {
                        eVar.f11407h = i11 + 1;
                    }
                    c0Var.j(Boolean.valueOf(!eVar.f11409j));
                    eVar.f11402c.j(new ArrayList(arrayList));
                    return;
                }
                if (i11 > 1) {
                    eVar.f11409j = true;
                }
                c0Var.j(Boolean.valueOf(!eVar.f11409j));
                return;
            default:
                SearchViewModel searchViewModel = (SearchViewModel) obj2;
                String str2 = (String) obj;
                c0 c0Var2 = searchViewModel.f7853d;
                try {
                    y7.v vVar = searchViewModel.f7850a;
                    String trim = str2.trim();
                    vVar.getClass();
                    try {
                        e8.a aVar2 = vVar.f11646a;
                        aVar2.getClass();
                        try {
                            emptyList = aVar2.f3594a.m(trim, i11);
                        } catch (Exception e10) {
                            Log.e("AnimeRepository", "search failed", e10);
                            emptyList = Collections.emptyList();
                        }
                    } catch (Exception unused4) {
                        emptyList = Collections.emptyList();
                    }
                    c0Var2.h(b8.a.d(emptyList));
                    return;
                } catch (Exception e11) {
                    Log.e("SearchVM", "search", e11);
                    c0Var2.h(b8.a.a("Search failed"));
                    return;
                }
        }
    }

    public /* synthetic */ k(Object obj, int i10, Object obj2, int i11) {
        this.f3830a = i11;
        this.f3832c = obj;
        this.f3831b = i10;
        this.f3833d = obj2;
    }

    public /* synthetic */ k(Object obj, Object obj2, int i10, int i11) {
        this.f3830a = i11;
        this.f3832c = obj;
        this.f3833d = obj2;
        this.f3831b = i10;
    }
}
