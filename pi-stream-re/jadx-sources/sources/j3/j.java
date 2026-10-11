package j3;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import c1.z0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import msr.pistream.app.R;
import msr.pistream.app.download.PiStreamDownloadService;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6027b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f6026a = i10;
        this.f6027b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z9;
        String str;
        String str2;
        String str3;
        String upperCase;
        String str4;
        int i10 = this.f6026a;
        boolean z10 = true;
        Object obj = this.f6027b;
        switch (i10) {
            case 0:
                x xVar = ((k) obj).f6030g;
                z0 z0Var = xVar.f6136y0;
                if (z0Var != null && ((c1.i) z0Var).d(29)) {
                    y1.j I = ((j1.d0) xVar.f6136y0).I();
                    z0 z0Var2 = xVar.f6136y0;
                    I.getClass();
                    y1.i iVar = new y1.i(I);
                    iVar.a(1);
                    iVar.k(1);
                    ((j1.d0) z0Var2).Y(iVar.d());
                    xVar.f6114f.f6079e[1] = xVar.getResources().getString(R.string.exo_track_selection_auto);
                    xVar.B.dismiss();
                    return;
                }
                return;
            case 1:
                q qVar = (q) obj;
                int i11 = q.f6073y;
                int c6 = qVar.c();
                x xVar2 = qVar.f6077x;
                View view2 = xVar2.Q;
                if (c6 == 0) {
                    view2.getClass();
                    xVar2.e(xVar2.f6133x, view2);
                    return;
                } else if (c6 == 1) {
                    view2.getClass();
                    xVar2.e(xVar2.f6137z, view2);
                    return;
                } else {
                    xVar2.B.dismiss();
                    return;
                }
            case 2:
                x xVar3 = ((k) obj).f6030g;
                z0 z0Var3 = xVar3.f6136y0;
                if (z0Var3 != null && ((c1.i) z0Var3).d(29)) {
                    y1.j I2 = ((j1.d0) xVar3.f6136y0).I();
                    z0 z0Var4 = xVar3.f6136y0;
                    I2.getClass();
                    y1.i iVar2 = new y1.i(I2);
                    iVar2.a(3);
                    iVar2.f1755v = -3;
                    ((j1.d0) z0Var4).Y(iVar2.d());
                    xVar3.B.dismiss();
                    return;
                }
                return;
            case 3:
                m6.d dVar = (m6.d) obj;
                EditText editText = dVar.f7463i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.q();
                    return;
                }
                return;
            case 4:
                ((m6.k) obj).u();
                return;
            case 5:
                boolean z11 = false;
                m6.u uVar = (m6.u) obj;
                EditText editText2 = uVar.f7540f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = uVar.f7540f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z11 = true;
                    }
                    if (z11) {
                        uVar.f7540f.setTransformationMethod(null);
                    } else {
                        uVar.f7540f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        uVar.f7540f.setSelection(selectionEnd);
                    }
                    uVar.q();
                    return;
                }
                return;
            case 6:
                l8.z zVar = (l8.z) ((i.g) obj).f5196b;
                zVar.getClass();
                j1.n nVar = new j1.n(zVar, 0);
                int i12 = MainActivity.f7741b0;
                zVar.f7036b.P("Continue watching", nVar, true);
                return;
            case zzaja.zze.zzg /* 7 */:
                try {
                    ((Activity) obj).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://buymeacoffee.com/yourusername")));
                    return;
                } catch (Exception e10) {
                    Log.e("SupportDialog", "open coffee link", e10);
                    return;
                }
            case 8:
                Dialog dialog = ((Dialog[]) obj)[0];
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 9:
                l8.z zVar2 = (l8.z) obj;
                zVar2.getClass();
                int i13 = MainActivity.f7741b0;
                MainActivity mainActivity = zVar2.f7036b;
                mainActivity.getClass();
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.addFlags(195);
                try {
                    mainActivity.startActivityForResult(intent, 7105);
                    return;
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(mainActivity, "No file picker app available on this device", 0).show();
                    return;
                }
            case 10:
                Context context = (Context) obj;
                z7.f o = z7.f.o();
                o.getClass();
                Context applicationContext = context.getApplicationContext();
                Iterator it = z7.d.a(applicationContext).iterator();
                boolean z12 = false;
                while (it.hasNext()) {
                    z7.b bVar = (z7.b) it.next();
                    if (bVar.f12101u == 5) {
                        bVar.f12101u = 1;
                        bVar.f12102v = "";
                        z7.d.c(applicationContext, bVar);
                        z12 = true;
                    }
                }
                if (z12) {
                    o.l();
                    PiStreamDownloadService.startAction(applicationContext, PiStreamDownloadService.ACTION_KICK);
                    o.x(applicationContext);
                }
                Toast.makeText(context, "Retrying failed downloads", 0).show();
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                l8.z zVar3 = (l8.z) obj;
                zVar3.getClass();
                int i14 = MainActivity.f7741b0;
                MainActivity mainActivity2 = zVar3.f7036b;
                mainActivity2.getClass();
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent2.addFlags(195);
                try {
                    mainActivity2.startActivityForResult(intent2, 7104);
                    return;
                } catch (ActivityNotFoundException unused2) {
                    Toast.makeText(mainActivity2, "No file picker app available on this device", 0).show();
                    return;
                }
            case 12:
                f8.h hVar = ((n8.a) ((z3.e) obj).f12044b).f8024b.E;
                n8.a aVar = (n8.a) hVar.f3961a;
                PlayerActivity playerActivity = aVar.f8024b;
                Log.d("PlayerUI", "showQualityPanel sources=" + ((ArrayList) aVar.k()).size() + " selIdx=" + aVar.j());
                int j4 = aVar.j();
                List k10 = aVar.k();
                if (j4 >= 0) {
                    ArrayList<a8.h> arrayList = (ArrayList) k10;
                    if (j4 < arrayList.size()) {
                        PopupWindow popupWindow = new PopupWindow();
                        LinearLayout E = aVar.E(popupWindow, 380);
                        E.addView(aVar.q("Choose quality"), new LinearLayout.LayoutParams(-1, w8.i.e(playerActivity, 58)));
                        LinearLayout linearLayout = new LinearLayout(playerActivity);
                        linearLayout.setOrientation(1);
                        a3.g.w(-1, -2, E, linearLayout);
                        String str5 = ((a8.h) arrayList.get(j4)).f199b;
                        PlayerActivity playerActivity2 = aVar.f8024b;
                        String str6 = playerActivity2.A0;
                        String i15 = aVar.i();
                        String str7 = "AUTO";
                        if (i15 != null && !"AUTO".equalsIgnoreCase(i15)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        linearLayout.addView(aVar.s("AUTO", z9, new m8.l0(hVar, arrayList, j4, popupWindow)));
                        if (!str5.contains(".m3u8") && arrayList.size() > 1) {
                            String str8 = playerActivity2.A0;
                            String i16 = aVar.i();
                            String str9 = ((a8.h) arrayList.get(j4)).f204x;
                            for (a8.h hVar2 : arrayList) {
                                if (hVar2 != null && (str3 = hVar2.f199b) != null && (str9 == null || (str4 = hVar2.f204x) == null || str9.equals(str4))) {
                                    String str10 = hVar2.f198a;
                                    if (str10 == null) {
                                        upperCase = str7;
                                    } else {
                                        upperCase = str10.toUpperCase(Locale.US);
                                    }
                                    if (!str3.equals(str8) || (i16 != null && !upperCase.equalsIgnoreCase(i16))) {
                                        z10 = false;
                                    }
                                    str = i16;
                                    str2 = str7;
                                    linearLayout.addView(aVar.s(upperCase, z10, new v1.z(hVar, str3, upperCase, popupWindow, 6)));
                                } else {
                                    str = i16;
                                    str2 = str7;
                                }
                                z10 = true;
                                i16 = str;
                                str7 = str2;
                            }
                            aVar.A(popupWindow, E);
                            return;
                        }
                        TextView l10 = w8.i.l(playerActivity, "Only AUTO available", 16, w8.i.f11068h, 1);
                        l10.setGravity(16);
                        linearLayout.addView(l10, new LinearLayout.LayoutParams(-1, w8.i.e(playerActivity, 54)));
                        aVar.A(popupWindow, E);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((PopupWindow) obj).dismiss();
                return;
        }
    }
}
