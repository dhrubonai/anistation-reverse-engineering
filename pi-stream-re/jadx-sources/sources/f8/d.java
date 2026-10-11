package f8;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import h8.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import l8.z;
import m8.v0;
import msr.pistream.app.R;
import r6.h0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3942d;

    public /* synthetic */ d(Object obj, Object obj2, EditText editText, int i10) {
        this.f3939a = i10;
        this.f3941c = obj;
        this.f3942d = obj2;
        this.f3940b = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        switch (this.f3939a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f3941c;
                EditText editText = (EditText) this.f3940b;
                ImageView imageView = (ImageView) this.f3942d;
                int i11 = e.J0;
                zArr[0] = true ^ zArr[0];
                int selectionStart = editText.getSelectionStart();
                if (zArr[0]) {
                    editText.setInputType(145);
                    editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    editText.setInputType(129);
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                editText.setTypeface(Typeface.DEFAULT);
                if (selectionStart >= 0) {
                    editText.setSelection(Math.min(selectionStart, editText.getText().length()));
                }
                if (zArr[0]) {
                    i10 = R.drawable.ic_eye_visible;
                } else {
                    i10 = R.drawable.ic_eye_hidden;
                }
                imageView.setImageResource(i10);
                return;
            case 1:
                x xVar = (x) this.f3941c;
                LinearLayout linearLayout = (LinearLayout) this.f3942d;
                EditText editText2 = (EditText) this.f3940b;
                xVar.getClass();
                if (linearLayout.getVisibility() == 0) {
                    linearLayout.setVisibility(8);
                    editText2.setText("");
                    xVar.f5138t = "";
                    xVar.i();
                    return;
                }
                linearLayout.setVisibility(0);
                editText2.requestFocus();
                return;
            case 2:
                x xVar2 = (x) this.f3941c;
                String str = (String) this.f3940b;
                String str2 = (String) this.f3942d;
                xVar2.f5124e = str;
                xVar2.f5125f = str2;
                xVar2.f();
                return;
            case 3:
                h8.h hVar = (h8.h) this.f3941c;
                a8.b bVar = (a8.b) this.f3940b;
                AlertDialog[] alertDialogArr = (AlertDialog[]) this.f3942d;
                Context context = hVar.f5039b;
                String f10 = w7.c.f(bVar);
                synchronized (w7.c.f11040a) {
                    w7.c.d(context);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = w7.c.f11041b.iterator();
                    while (it.hasNext()) {
                        a8.b bVar2 = (a8.b) it.next();
                        if (!f10.equals(w7.c.f(bVar2))) {
                            arrayList.add(bVar2);
                        }
                    }
                    w7.c.f11041b = arrayList;
                    w7.c.f11042c = true;
                    w7.c.g(context);
                }
                hVar.f5040c.d(false);
                AlertDialog alertDialog = alertDialogArr[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    return;
                }
                return;
            case 4:
                int[] iArr = (int[]) this.f3941c;
                TextView textView = (TextView) this.f3940b;
                String str3 = (String) this.f3942d;
                int i12 = iArr[0];
                if (i12 > 0) {
                    iArr[0] = i12 - 1;
                    textView.setText(iArr[0] + str3);
                    return;
                }
                return;
            case 5:
                i8.d dVar = (i8.d) this.f3941c;
                i8.b bVar3 = (i8.b) this.f3940b;
                a8.b bVar4 = (a8.b) this.f3942d;
                dVar.getClass();
                int c6 = bVar3.c();
                if (c6 != -1) {
                    h0.x0(dVar.f5420d, bVar4);
                    dVar.f5424h.remove(c6);
                    dVar.f7192a.c(c6);
                    return;
                }
                return;
            case 6:
                AlertDialog alertDialog2 = (AlertDialog) this.f3941c;
                Consumer consumer = (Consumer) this.f3942d;
                EditText editText3 = (EditText) this.f3940b;
                alertDialog2.dismiss();
                consumer.accept(editText3.getText().toString().trim());
                return;
            case zzaja.zze.zzg /* 7 */:
                l8.d dVar2 = (l8.d) this.f3941c;
                List list = (List) this.f3940b;
                String str4 = (String) this.f3942d;
                int i13 = l8.d.f6901t0;
                dVar2.getClass();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    z7.f.o().f(dVar2.f4484m0, ((z7.b) it2.next()).f12082a);
                }
                Toast.makeText(dVar2.f4484m0, "Deleted " + str4, 0).show();
                return;
            case 8:
                final z zVar = (z) this.f3941c;
                final Context context2 = (Context) this.f3940b;
                final Runnable runnable = (Runnable) this.f3942d;
                int[] iArr2 = v0.f7722a;
                zVar.j("Custom font", new String[]{"Select .ttf file", "Clear custom font"}, -1, new BiConsumer() { // from class: m8.p0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        Context context3 = context2;
                        Runnable runnable2 = runnable;
                        l8.z zVar2 = zVar;
                        if (((Integer) obj).intValue() == 1) {
                            com.bumptech.glide.c.b0(context3).edit().putString("subtitle_custom_font_path", "").apply();
                            runnable2.run();
                            zVar2.f();
                            return;
                        }
                        z3.e eVar = zVar2.f7036b.C;
                        eVar.getClass();
                        AlertDialog.Builder builder = new AlertDialog.Builder((Activity) eVar.f12044b);
                        builder.setTitle("Select .ttf font file");
                        builder.setMessage("Pick a .ttf file from your device storage");
                        builder.setPositiveButton("Pick file", new n(eVar, 2));
                        builder.setNegativeButton("Cancel", (DialogInterface.OnClickListener) null);
                        builder.show();
                    }
                });
                return;
            case 9:
                final Context context3 = (Context) this.f3941c;
                String[] strArr = (String[]) this.f3940b;
                final z zVar2 = (z) this.f3942d;
                int[] iArr3 = v0.f7722a;
                zVar2.j("Default Subtitle Language", strArr, Arrays.asList(strArr).indexOf(com.bumptech.glide.c.A(context3)), new BiConsumer() { // from class: m8.j0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        Context context4 = context3;
                        l8.z zVar3 = zVar2;
                        com.bumptech.glide.c.b0(context4).edit().putString("subtitle_default_language", (String) obj2).apply();
                        zVar3.f();
                    }
                });
                return;
            default:
                h hVar2 = (h) this.f3941c;
                a8.e eVar = (a8.e) this.f3940b;
                PopupWindow popupWindow = (PopupWindow) this.f3942d;
                ((n8.a) hVar2.f3961a).w(eVar);
                popupWindow.dismiss();
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f3939a = i10;
        this.f3941c = obj;
        this.f3940b = obj2;
        this.f3942d = obj3;
    }
}
