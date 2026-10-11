package h8;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.firebase.auth.FirebaseAuth;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import l8.h0;
import l8.n0;
import l8.r0;
import m8.v0;
import msr.pistream.app.R;
import msr.pistream.app.download.PiStreamDownloadService;
import msr.pistream.app.ui.auth.WelcomeActivity;
import msr.pistream.app.ui.detail.DetailActivity;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5097c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.f5095a = i10;
        this.f5096b = obj;
        this.f5097c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int parseColor;
        int i11 = this.f5095a;
        Object obj = this.f5097c;
        Object obj2 = this.f5096b;
        switch (i11) {
            case 0:
                x xVar = (x) obj2;
                ImageView imageView = (ImageView) obj;
                boolean z9 = !xVar.f5137s;
                xVar.f5137s = z9;
                try {
                    if (z9) {
                        i10 = w8.i.f11065e;
                    } else {
                        i10 = w8.i.f11068h;
                    }
                    imageView.setColorFilter(i10);
                } catch (Exception unused) {
                }
                xVar.i();
                return;
            case 1:
                final x xVar2 = (x) obj2;
                final a8.b bVar = (a8.b) obj;
                if (!xVar2.f5143y) {
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = xVar2.f5130k.iterator();
                    while (it.hasNext()) {
                        a8.e eVar = (a8.e) it.next();
                        String str = eVar.f184b;
                        if (str != null && xVar2.f5128i.contains(str)) {
                            arrayList.add(eVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Toast.makeText(xVar2.f5121b, "Select at least one episode", 0).show();
                        return;
                    }
                    xVar2.f5143y = true;
                    TextView textView = xVar2.f5141w;
                    if (textView != null) {
                        textView.setText("Resolving 0/" + arrayList.size() + "…");
                    }
                    final int i12 = xVar2.f5126g;
                    final String str2 = xVar2.f5124e;
                    final String str3 = xVar2.f5125f;
                    final int i13 = xVar2.f5127h;
                    Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: h8.t
                        /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 207
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: h8.t.run():void");
                        }
                    });
                    return;
                }
                return;
            case 2:
                x xVar3 = (x) obj2;
                a8.e eVar2 = (a8.e) obj;
                xVar3.getClass();
                String str4 = eVar2.f184b;
                if (str4 != null) {
                    HashSet hashSet = xVar3.f5128i;
                    boolean contains = hashSet.contains(str4);
                    String str5 = eVar2.f184b;
                    if (contains) {
                        hashSet.remove(str5);
                    } else {
                        hashSet.add(str5);
                    }
                    xVar3.i();
                    xVar3.l();
                    return;
                }
                return;
            case 3:
                x xVar4 = (x) obj2;
                xVar4.f5123d = -1;
                xVar4.h((List) obj);
                xVar4.i();
                return;
            case 4:
                x xVar5 = (x) obj2;
                xVar5.getClass();
                ((AlertDialog) obj).dismiss();
                try {
                    xVar5.f5120a.a();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 5:
                i8.d dVar = (i8.d) obj2;
                dVar.getClass();
                int c6 = ((i8.b) obj).c();
                if (c6 != -1) {
                    Context context = dVar.f5420d;
                    Intent intent = new Intent(context, (Class<?>) DetailActivity.class);
                    intent.putExtra("anime", (Parcelable) dVar.f5424h.get(c6));
                    context.startActivity(intent);
                    if (context instanceof Activity) {
                        ((Activity) context).overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((i8.d) obj2).f5421e.e((a8.b) obj);
                return;
            case zzaja.zze.zzg /* 7 */:
                y.c cVar = (y.c) obj2;
                String str6 = (String) obj;
                l8.t tVar = ((l8.u) cVar.f11425c).f7022t0;
                if (tVar != null) {
                    j1.s sVar = new j1.s(cVar, cVar.f11423a, (String) cVar.f11424b);
                    l8.z zVar = (l8.z) tVar;
                    int i14 = zVar.f7035a;
                    MainActivity mainActivity = zVar.f7036b;
                    switch (i14) {
                        case 20:
                            mainActivity.P(str6, sVar, false);
                            return;
                        default:
                            mainActivity.P(str6, sVar, false);
                            return;
                    }
                }
                return;
            case 8:
                ((i8.j) obj2).f5441e.b((a8.e) obj);
                return;
            case 9:
                ((i8.o) obj2).B.getClass();
                return;
            case 10:
                Dialog dialog = (Dialog) obj;
                i0 i0Var = ((i0[]) obj2)[0];
                if (i0Var == null || !i0Var.f2431a) {
                    try {
                        dialog.dismiss();
                        return;
                    } catch (Exception e10) {
                        Log.e("ForceUpdateDialog", "dismiss", e10);
                        return;
                    }
                }
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                i0 i0Var2 = (i0) obj2;
                k1.x xVar6 = (k1.x) obj;
                if (!i0Var2.f2431a) {
                    try {
                        xVar6.c(i0Var2);
                        return;
                    } catch (Exception e11) {
                        Log.e("ForceUpdateDialog", "click", e11);
                        return;
                    }
                }
                return;
            case 12:
                Activity activity = (Activity) obj;
                ((AlertDialog) obj2).dismiss();
                FirebaseAuth.getInstance().signOut();
                Intent intent2 = new Intent(activity, (Class<?>) WelcomeActivity.class);
                intent2.setFlags(268468224);
                activity.startActivity(intent2);
                activity.finish();
                return;
            case 13:
                Activity activity2 = (Activity) obj2;
                ((ClipboardManager) activity2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("crypto", (String) obj));
                Toast.makeText(activity2, "Copied!", 0).show();
                return;
            case 14:
                List list = (List) obj2;
                list.clear();
                list.addAll(w7.a.f11020a);
                ((m8.y) obj).a(new ArrayList(list));
                return;
            case 15:
                l8.d dVar2 = (l8.d) obj2;
                String str7 = (String) obj;
                HashSet hashSet2 = dVar2.f6907s0;
                if (hashSet2.contains(str7)) {
                    hashSet2.remove(str7);
                } else {
                    hashSet2.add(str7);
                }
                dVar2.Z();
                return;
            case 16:
                int i15 = l8.g.A0;
                ((Consumer) obj2).accept((String) obj);
                return;
            case 17:
                a8.b bVar2 = (a8.b) obj;
                l8.z zVar2 = ((h0) obj2).f6943t0;
                if (zVar2 != null) {
                    zVar2.d(bVar2);
                    return;
                }
                return;
            case 18:
                h0 h0Var = (h0) obj2;
                int i16 = h0.C0;
                h0Var.getClass();
                h0Var.f6942s0.f7845b.j((String) ((LinearLayout) obj).getTag());
                h0Var.Y();
                return;
            case 19:
                a8.b bVar3 = (a8.b) obj;
                l8.z zVar3 = ((n0) obj2).f6987u0;
                if (zVar3 != null) {
                    zVar3.d(bVar3);
                    return;
                }
                return;
            case 20:
                a8.b bVar4 = (a8.b) obj;
                l8.z zVar4 = ((r0) obj2).f7008t0;
                if (zVar4 != null) {
                    zVar4.d(bVar4);
                    return;
                }
                return;
            case 21:
                m8.h hVar = (m8.h) obj2;
                Switch r12 = (Switch) obj;
                boolean z10 = !hVar.f7608f;
                hVar.f7608f = z10;
                r12.setChecked(z10);
                if (hVar.f7608f) {
                    parseColor = w8.i.f11065e;
                } else {
                    parseColor = Color.parseColor("#888888");
                }
                r12.setThumbTintList(ColorStateList.valueOf(parseColor));
                hVar.f7612j.setText(hVar.d());
                return;
            case 22:
                z3.e eVar3 = (z3.e) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                for (File file : w8.d.d((Context) eVar3.f12044b)) {
                    file.delete();
                }
                eVar3.i(linearLayout);
                return;
            case 23:
                Context context2 = (Context) obj2;
                l8.z zVar5 = (l8.z) obj;
                z7.f o = z7.f.o();
                o.getClass();
                Context applicationContext = context2.getApplicationContext();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = z7.d.a(applicationContext).iterator();
                while (it2.hasNext()) {
                    z7.b bVar5 = (z7.b) it2.next();
                    int i17 = bVar5.f12101u;
                    if (i17 == 4 || i17 == 5 || i17 == 6) {
                        arrayList2.add(bVar5);
                        String str8 = bVar5.f12082a;
                        synchronized (z7.d.f12118a) {
                            applicationContext.getApplicationContext().getSharedPreferences("pistream_downloads", 0).edit().remove(str8).apply();
                        }
                    }
                }
                o.l();
                PiStreamDownloadService.refresh(applicationContext);
                o.w(com.bumptech.glide.c.u(applicationContext)).submit(new d0.a(o, arrayList2, applicationContext, 8));
                Toast.makeText(context2, "Cleared with files", 0).show();
                zVar5.f();
                return;
            case 24:
                String str9 = (String) obj2;
                l8.z zVar6 = (l8.z) obj;
                if (str9.isEmpty()) {
                    zVar6.m("No email on this account");
                    return;
                } else {
                    FirebaseAuth.getInstance().sendPasswordResetEmail(str9).addOnCompleteListener(new k1.x(16, zVar6, str9));
                    return;
                }
            case 25:
                int[] iArr = v0.f7722a;
                ((Runnable) obj2).run();
                Toast.makeText((Context) obj, "Subtitle settings saved", 0).show();
                return;
            case 26:
                Context context3 = (Context) obj2;
                int[] iArr2 = v0.f7722a;
                com.bumptech.glide.c.b0(context3).edit().remove("subtitle_font_size").remove("subtitle_font_color").remove("subtitle_font_style").remove("subtitle_bg_opacity").remove("subtitle_bottom_padding").remove("subtitle_custom_font_path").remove("subtitle_default_language").remove("subtitle_bg_color").remove("subtitle_bg_none").remove("subtitle_shadow").apply();
                Toast.makeText(context3, "Subtitle settings reset to default", 0).show();
                ((l8.z) obj).f();
                return;
            case 27:
                int[] iArr3 = v0.f7722a;
                ((Consumer) obj2).accept(Boolean.valueOf(!((boolean[]) obj)[0]));
                return;
            default:
                ((n8.a) ((z3.e) obj2).f12044b).B((TextView) obj);
                return;
        }
    }
}
