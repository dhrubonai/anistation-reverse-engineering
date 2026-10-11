package z3;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import b4.c0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import e4.z;
import f.m0;
import g0.y;
import h8.d0;
import h8.r;
import j1.p;
import j3.u;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l1.f0;
import m8.v;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.ui.player.PlayerActivity;
import p4.k;
import p4.m;
import r6.h0;
import v3.l;
import v3.o;
import x3.e0;

/* loaded from: classes.dex */
public final class e implements o, e4.o, y, OnCompleteListener, ActivityRetainedComponentBuilder, ServiceComponentBuilder, d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12043a;

    /* renamed from: b, reason: collision with root package name */
    public Object f12044b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12045c;

    public e() {
        b5.d dVar = b5.d.f1517d;
        this.f12043a = 13;
        this.f12044b = new SparseIntArray();
        this.f12045c = dVar;
    }

    public static TextView l(PlayerActivity playerActivity, String str, boolean z9) {
        int i10;
        int i11;
        int i12;
        float f10;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(w8.i.e(playerActivity, 100));
        gradientDrawable.setColor(0);
        int e10 = w8.i.e(playerActivity, 2);
        if (z9) {
            i10 = w8.i.f11065e;
        } else {
            i10 = w8.i.f11068h;
        }
        gradientDrawable.setStroke(e10, i10);
        if (z9) {
            i11 = w8.i.f11065e;
        } else {
            i11 = w8.i.f11068h;
        }
        TextView l10 = w8.i.l(playerActivity, str, 13, i11, 1);
        l10.setGravity(17);
        l10.setPadding(w8.i.e(playerActivity, 16), w8.i.e(playerActivity, 8), w8.i.e(playerActivity, 16), w8.i.e(playerActivity, 8));
        l10.setMinHeight(w8.i.e(playerActivity, 36));
        l10.setMinWidth(w8.i.e(playerActivity, 64));
        l10.setBackground(gradientDrawable);
        if (z9) {
            i12 = w8.i.f11065e;
        } else {
            i12 = w8.i.f11068h;
        }
        l10.setTextColor(i12);
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.55f;
        }
        l10.setAlpha(f10);
        return l10;
    }

    public static z m(ImageDecoder.Source source, int i10, int i11, l lVar) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new d4.b(i10, i11, lVar));
        if (com.google.android.gms.internal.p002firebaseauthapi.a.x(decodeDrawable)) {
            return new z(com.google.android.gms.internal.p002firebaseauthapi.a.i(decodeDrawable), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public final byte[] A(int i10) {
        Object obj = this.f12045c;
        if (((y3.h) obj) == null) {
            return new byte[i10];
        }
        return (byte[]) ((y3.h) obj).d(i10, byte[].class);
    }

    public final void B(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((n.e) this.f12045c)) {
            ((n.e) this.f12045c).put(new k(cls, cls2, cls3), list);
        }
    }

    public final void C() {
        n8.a aVar;
        PlayerActivity playerActivity;
        GridLayout gridLayout;
        boolean z9;
        int intValue;
        int[] iArr;
        int i10;
        Iterator it;
        int t9;
        int i11;
        int i12;
        int i13;
        Object obj = this.f12044b;
        PlayerActivity playerActivity2 = ((n8.a) obj).f8024b;
        if (playerActivity2 == null || (gridLayout = (playerActivity = (aVar = (n8.a) obj).f8024b).Y) == null) {
            return;
        }
        int i14 = 0;
        if (playerActivity.K0) {
            Context context = gridLayout.getContext();
            gridLayout.removeAllViews();
            int e10 = w8.i.e(context, 58);
            int e11 = w8.i.e(context, 4);
            int e12 = w8.i.e(context, 10);
            for (int i15 = 0; i15 < 10; i15++) {
                View j4 = h0.j(context, 0, e10, e12);
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.width = 0;
                layoutParams.height = e10;
                layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
                layoutParams.setMargins(e11, e11, e11, e11);
                gridLayout.addView(j4, layoutParams);
            }
            return;
        }
        List e13 = aVar.e();
        ArrayList L0 = h0.L0(e13);
        int i16 = 1;
        if (L0.size() > 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            n8.a aVar2 = (n8.a) this.f12044b;
            int i17 = aVar2.f8023a;
            PlayerActivity playerActivity3 = aVar2.f8024b;
            switch (i17) {
                case 0:
                    intValue = playerActivity3.v();
                    break;
                default:
                    intValue = playerActivity3.v();
                    break;
            }
        } else if (L0.isEmpty()) {
            intValue = 0;
        } else {
            intValue = ((Integer) L0.get(0)).intValue();
        }
        LinearLayout linearLayout = ((n8.a) this.f12044b).f8024b.Z;
        int i18 = 17;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            if (z9) {
                linearLayout.setVisibility(0);
                Iterator it2 = L0.iterator();
                while (it2.hasNext()) {
                    int intValue2 = ((Integer) it2.next()).intValue();
                    if (intValue2 == intValue) {
                        i14 = i16;
                    }
                    String n9 = a3.g.n("S", intValue2);
                    if (i14 != 0) {
                        i12 = -1;
                    } else {
                        i12 = w8.i.f11068h;
                    }
                    TextView l10 = w8.i.l(playerActivity2, n9, 15, i12, i16);
                    l10.setGravity(i18);
                    l10.setPadding(w8.i.e(playerActivity2, 18), w8.i.e(playerActivity2, 8), w8.i.e(playerActivity2, 18), w8.i.e(playerActivity2, 8));
                    if (i14 != 0) {
                        i13 = w8.i.f11065e;
                    } else {
                        i13 = w8.i.f11064d;
                    }
                    l10.setBackground(w8.i.j(i13, w8.i.e(playerActivity2, 100)));
                    w8.i.d(l10);
                    l10.setOnClickListener(new p8.d(this, intValue2, 1));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, w8.i.e(playerActivity2, 40));
                    layoutParams2.setMargins(0, 0, w8.i.e(playerActivity2, 10), 0);
                    linearLayout.addView(l10, layoutParams2);
                    i14 = 0;
                    i18 = 17;
                    i16 = 1;
                }
            } else {
                linearLayout.setVisibility(8);
            }
        }
        gridLayout.removeAllViews();
        int h10 = ((n8.a) this.f12044b).h();
        ArrayList arrayList = (ArrayList) e13;
        Iterator it3 = arrayList.iterator();
        int i19 = 0;
        while (it3.hasNext()) {
            a8.e eVar = (a8.e) it3.next();
            int[] D0 = h0.D0(eVar);
            if (D0 != null && (!z9 || D0[0] == intValue)) {
                int t10 = com.bumptech.glide.d.t(eVar);
                if (t10 > i19) {
                    i19 = t10;
                }
            }
        }
        ((n8.a) this.f12044b).getClass();
        int i20 = 1;
        int min = Math.min((h10 + 100) - 1, i19);
        a8.e d10 = ((n8.a) this.f12044b).d();
        if (d10 != null) {
            iArr = h0.D0(d10);
        } else {
            iArr = null;
        }
        int max = Math.max(1, gridLayout.getColumnCount());
        int e14 = w8.i.e(playerActivity2, 37);
        if (w8.i.f(playerActivity2)) {
            i10 = w8.i.e(playerActivity2, 32);
        } else {
            i10 = 0;
        }
        int i21 = playerActivity2.getResources().getDisplayMetrics().widthPixels - ((e14 + i10) * 2);
        int e15 = w8.i.e(playerActivity2, 4);
        int max2 = Math.max(w8.i.e(playerActivity2, 40), (i21 / max) - (e15 * 2));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            a8.e eVar2 = (a8.e) it4.next();
            int[] D02 = h0.D0(eVar2);
            if (D02 != null && ((!z9 || D02[0] == intValue) && (t9 = com.bumptech.glide.d.t(eVar2)) >= h10 && t9 <= min)) {
                it = it4;
                TextView l11 = w8.i.l(playerActivity2, String.valueOf(t9), 20, -1, i20);
                l11.setGravity(17);
                if (iArr == null || iArr[0] != D02[0] || iArr[i20] != D02[i20]) {
                    i20 = 0;
                }
                if (i20 != 0) {
                    i11 = w8.i.f11065e;
                } else {
                    i11 = w8.i.f11064d;
                }
                l11.setBackground(w8.i.j(i11, w8.i.e(playerActivity2, 10)));
                w8.i.d(l11);
                l11.setOnClickListener(new p8.i(this, eVar2, 0));
                GridLayout.LayoutParams layoutParams3 = new GridLayout.LayoutParams();
                layoutParams3.width = max2;
                layoutParams3.height = w8.i.e(playerActivity2, 58);
                layoutParams3.setMargins(e15, e15, e15, e15);
                gridLayout.addView(l11, layoutParams3);
            } else {
                it = it4;
            }
            i20 = 1;
            it4 = it;
        }
    }

    public final void D() {
        LinearLayout linearLayout;
        boolean z9;
        TextView l10;
        Object obj = this.f12044b;
        PlayerActivity playerActivity = ((n8.a) obj).f8024b;
        if (playerActivity == null || (linearLayout = ((n8.a) obj).f8024b.f7751b0) == null) {
            return;
        }
        linearLayout.removeAllViews();
        List k10 = ((n8.a) this.f12044b).k();
        PlayerActivity playerActivity2 = ((n8.a) this.f12044b).f8024b;
        boolean z10 = playerActivity2.f7775y.f9944l;
        boolean z11 = playerActivity2.f7776y0;
        int i10 = -1;
        int i11 = 0;
        if (z10 && ((ArrayList) k10).isEmpty()) {
            LinearLayout linearLayout2 = new LinearLayout(playerActivity);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            linearLayout2.setPadding(0, w8.i.e(playerActivity, 6), 0, w8.i.e(playerActivity, 6));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, w8.i.e(playerActivity, 36));
            layoutParams.gravity = 17;
            linearLayout2.setLayoutParams(layoutParams);
            linearLayout2.setGravity(17);
            linearLayout2.addView(w8.i.h(playerActivity, 18), new LinearLayout.LayoutParams(w8.i.e(playerActivity, 18), w8.i.e(playerActivity, 18)));
            TextView l11 = w8.i.l(playerActivity, "Loading sources...", 13, w8.i.f11068h, 0);
            l11.setPadding(w8.i.e(playerActivity, 10), 0, 0, 0);
            l11.setGravity(16);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.45f, 1.0f);
            ofFloat.setDuration(700L);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new p8.b(l11, 0));
            l11.addOnAttachStateChangeListener(new p8.k(ofFloat, 0));
            if (l11.isAttachedToWindow()) {
                ofFloat.start();
            } else {
                l11.post(new p8.c(ofFloat, 0));
            }
            linearLayout2.addView(l11);
            linearLayout.setGravity(17);
            linearLayout.addView(linearLayout2);
            return;
        }
        ArrayList F = ((n8.a) this.f12044b).F();
        ArrayList g10 = com.bumptech.glide.d.g(k10, F);
        int j4 = ((n8.a) this.f12044b).j();
        if (g10.isEmpty()) {
            if (z11) {
                TextView l12 = l(playerActivity, "No sources", false);
                l12.setEnabled(false);
                linearLayout.addView(l12, new LinearLayout.LayoutParams(-2, w8.i.e(playerActivity, 36)));
                return;
            }
            return;
        }
        int i12 = 0;
        while (i12 < g10.size()) {
            String str = (String) g10.get(i12);
            int intValue = ((Integer) F.get(i12)).intValue();
            if (intValue == j4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                l10 = w8.i.i(playerActivity, str, true);
                l10.setTextSize(13.0f);
                l10.setTextColor(i10);
                l10.setOnClickListener(null);
            } else {
                l10 = l(playerActivity, str, true);
                l10.setOnClickListener(new p8.d(this, intValue, i11));
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, w8.i.e(playerActivity, 36));
            layoutParams2.setMargins(0, 0, w8.i.e(playerActivity, 8), 0);
            if (i12 == g10.size() - 1) {
                layoutParams2.rightMargin = 0;
            }
            l10.setMinWidth(w8.i.e(playerActivity, 64));
            w8.i.d(l10);
            linearLayout.addView(l10, layoutParams2);
            i12++;
            i10 = -1;
        }
        if (((n8.a) this.f12044b).o()) {
            LinearLayout linearLayout3 = new LinearLayout(playerActivity);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(16);
            linearLayout3.setPadding(w8.i.e(playerActivity, 10), w8.i.e(playerActivity, 6), w8.i.e(playerActivity, 10), w8.i.e(playerActivity, 6));
            linearLayout3.addView(w8.i.h(playerActivity, 14), new LinearLayout.LayoutParams(w8.i.e(playerActivity, 14), w8.i.e(playerActivity, 14)));
            TextView l13 = w8.i.l(playerActivity, "Loading more servers...", 12, w8.i.f11068h, 0);
            l13.setPadding(w8.i.e(playerActivity, 6), 0, 0, 0);
            l13.setAlpha(0.85f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.45f, 1.0f);
            ofFloat2.setDuration(700L);
            ofFloat2.setRepeatMode(2);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.addUpdateListener(new p8.b(l13, 1));
            l13.addOnAttachStateChangeListener(new p8.k(ofFloat2, 1));
            if (l13.isAttachedToWindow()) {
                ofFloat2.start();
            } else {
                l13.post(new p8.c(ofFloat2, 1));
            }
            linearLayout3.addView(l13);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, w8.i.e(playerActivity, 36));
            layoutParams3.setMargins(w8.i.e(playerActivity, 4), 0, 0, 0);
            linearLayout.addView(linearLayout3, layoutParams3);
        }
    }

    public final void E(File file) {
        try {
            Uri uriForFile = FileProvider.getUriForFile((Context) this.f12044b, ((Context) this.f12044b).getPackageName() + ".fileprovider", file);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.addFlags(1);
            ((Context) this.f12044b).startActivity(Intent.createChooser(intent, "Share crash log"));
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (sb.length() > 102400) {
                        sb.append("\n... [TRUNCATED - file too large]");
                        break;
                    } else {
                        sb.append(readLine);
                        sb.append("\n");
                    }
                }
                bufferedReader.close();
            } catch (Exception e10) {
                Log.e("MainActivity", "exception", e10);
            }
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", sb.toString());
            try {
                ((Context) this.f12044b).startActivity(Intent.createChooser(intent2, "Share crash log"));
            } catch (ActivityNotFoundException e11) {
                Log.e("MainActivity", "activity not found", e11);
                Toast.makeText((Context) this.f12044b, "No app available to share on this device", 0).show();
            }
        }
    }

    public final void F(LinearLayout linearLayout, final File file) {
        final int i10 = 1;
        final Dialog[] dialogArr = new Dialog[1];
        LinearLayout linearLayout2 = new LinearLayout((Context) this.f12044b);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(w8.i.e((Context) this.f12044b, 24), w8.i.e((Context) this.f12044b, 24), w8.i.e((Context) this.f12044b, 24), w8.i.e((Context) this.f12044b, 24));
        linearLayout2.addView(w8.i.l((Context) this.f12044b, new SimpleDateFormat("MMM dd, yyyy  hh:mm a", Locale.US).format(new Date(file.lastModified())), 16, -1, 1));
        View view = new View((Context) this.f12044b);
        view.setBackgroundColor(w8.i.f11064d);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        final int i11 = 0;
        layoutParams.setMargins(0, w8.i.e((Context) this.f12044b, 12), 0, w8.i.e((Context) this.f12044b, 12));
        linearLayout2.addView(view, layoutParams);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (sb.length() > 102400) {
                    sb.append("\n... [TRUNCATED - file too large]");
                    break;
                } else {
                    sb.append(readLine);
                    sb.append("\n");
                }
            }
            bufferedReader.close();
        } catch (Exception e10) {
            Log.e("MainActivity", "exception", e10);
        }
        ScrollView scrollView = new ScrollView((Context) this.f12044b);
        scrollView.setVerticalScrollBarEnabled(false);
        TextView l10 = w8.i.l((Context) this.f12044b, sb.toString(), 11, -3355444, 0);
        l10.setLineSpacing(w8.i.e((Context) this.f12044b, 4), 1.0f);
        scrollView.addView(l10, new FrameLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, w8.i.e((Context) this.f12044b, 320));
        layoutParams2.setMargins(0, 0, 0, w8.i.e((Context) this.f12044b, 12));
        linearLayout2.addView(scrollView, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout((Context) this.f12044b);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(17);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.addView(n("Copy", new View.OnClickListener(this) { // from class: m8.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3.e f7640b;

            {
                this.f7640b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                Dialog[] dialogArr2 = dialogArr;
                File file2 = file;
                z3.e eVar = this.f7640b;
                switch (i12) {
                    case 0:
                        eVar.k(file2);
                        Dialog dialog = dialogArr2[0];
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    case 1:
                        eVar.r(file2);
                        Dialog dialog2 = dialogArr2[0];
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            return;
                        }
                        return;
                    default:
                        eVar.E(file2);
                        Dialog dialog3 = dialogArr2[0];
                        if (dialog3 != null) {
                            dialog3.dismiss();
                            return;
                        }
                        return;
                }
            }
        }));
        linearLayout3.addView(n("Download", new View.OnClickListener(this) { // from class: m8.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3.e f7640b;

            {
                this.f7640b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                Dialog[] dialogArr2 = dialogArr;
                File file2 = file;
                z3.e eVar = this.f7640b;
                switch (i12) {
                    case 0:
                        eVar.k(file2);
                        Dialog dialog = dialogArr2[0];
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    case 1:
                        eVar.r(file2);
                        Dialog dialog2 = dialogArr2[0];
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            return;
                        }
                        return;
                    default:
                        eVar.E(file2);
                        Dialog dialog3 = dialogArr2[0];
                        if (dialog3 != null) {
                            dialog3.dismiss();
                            return;
                        }
                        return;
                }
            }
        }));
        final int i12 = 2;
        linearLayout3.addView(n("Share", new View.OnClickListener(this) { // from class: m8.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z3.e f7640b;

            {
                this.f7640b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = i12;
                Dialog[] dialogArr2 = dialogArr;
                File file2 = file;
                z3.e eVar = this.f7640b;
                switch (i122) {
                    case 0:
                        eVar.k(file2);
                        Dialog dialog = dialogArr2[0];
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    case 1:
                        eVar.r(file2);
                        Dialog dialog2 = dialogArr2[0];
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            return;
                        }
                        return;
                    default:
                        eVar.E(file2);
                        Dialog dialog3 = dialogArr2[0];
                        if (dialog3 != null) {
                            dialog3.dismiss();
                            return;
                        }
                        return;
                }
            }
        }));
        linearLayout3.addView(n("Delete", new u(this, file, dialogArr, linearLayout, 3)));
        linearLayout3.addView(n("Close", new j3.j(dialogArr, 8)));
        final f.j create = new f.i((Context) this.f12044b, R.style.Theme_AppCompat_Dialog).setTitle("Crash Report").setView(linearLayout2).create();
        dialogArr[0] = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: m8.l
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                z3.e.this.getClass();
                f.j jVar = create;
                if (jVar.getWindow() != null) {
                    jVar.getWindow().setBackgroundDrawable(w8.i.j(w8.i.f11063c, w8.i.e((Context) r4.f12044b, 18)));
                }
            }
        });
        create.show();
    }

    public final void G(String str, int[] iArr, String str2, int i10, v vVar) {
        int i11 = 0;
        while (true) {
            if (i11 < iArr.length) {
                if (iArr[i11] == i10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = 0;
                break;
            }
        }
        int[] iArr2 = {i11};
        LinearLayout linearLayout = new LinearLayout((Activity) this.f12044b);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(w8.i.e((Activity) this.f12044b, 24), w8.i.e((Activity) this.f12044b, 8), w8.i.e((Activity) this.f12044b, 24), w8.i.e((Activity) this.f12044b, 24));
        View view = new View((Activity) this.f12044b);
        int i12 = w8.i.f11064d;
        view.setBackgroundColor(i12);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e((Activity) this.f12044b, 38), w8.i.e((Activity) this.f12044b, 3));
        layoutParams.gravity = 1;
        linearLayout.addView(view, layoutParams);
        TextView l10 = w8.i.l((Activity) this.f12044b, str, 20, -1, 1);
        LinearLayout.LayoutParams c6 = r.f.c(l10, 17, -1, -2);
        c6.setMargins(0, w8.i.e((Activity) this.f12044b, 20), 0, w8.i.e((Activity) this.f12044b, 16));
        linearLayout.addView(l10, c6);
        TextView l11 = w8.i.l((Activity) this.f12044b, iArr[i11] + str2, 24, -1, 1);
        l11.setGravity(17);
        l11.setBackground(w8.i.j(i12, (float) w8.i.e((Activity) this.f12044b, 12)));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, w8.i.e((Activity) this.f12044b, 44));
        layoutParams2.setMargins(0, 0, 0, w8.i.e((Activity) this.f12044b, 6));
        linearLayout.addView(l11, layoutParams2);
        SeekBar seekBar = new SeekBar((Activity) this.f12044b);
        seekBar.setPadding(0, w8.i.e((Activity) this.f12044b, 4), 0, w8.i.e((Activity) this.f12044b, 4));
        seekBar.setProgressDrawableTiled(((Activity) this.f12044b).getResources().getDrawable(android.R.drawable.progress_horizontal));
        seekBar.setSplitTrack(false);
        seekBar.setThumb(((Activity) this.f12044b).getResources().getDrawable(android.R.drawable.presence_online));
        seekBar.setThumbOffset(0);
        seekBar.setDuplicateParentStateEnabled(false);
        seekBar.setSoundEffectsEnabled(false);
        seekBar.setFocusable(false);
        seekBar.setFocusableInTouchMode(false);
        seekBar.setMax(iArr.length - 1);
        seekBar.setProgress(i11);
        linearLayout.addView(seekBar, new LinearLayout.LayoutParams(-1, w8.i.e((Activity) this.f12044b, 40)));
        LinearLayout linearLayout2 = new LinearLayout((Activity) this.f12044b);
        linearLayout2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, w8.i.e((Activity) this.f12044b, 22));
        linearLayout.addView(linearLayout2, layoutParams3);
        for (int i13 : iArr) {
            TextView l12 = w8.i.l((Activity) this.f12044b, String.valueOf(i13), 11, w8.i.f11068h, 0);
            l12.setGravity(17);
            linearLayout2.addView(l12, new LinearLayout.LayoutParams(0, -2, 1.0f));
        }
        seekBar.setOnSeekBarChangeListener(new j8.a(iArr2, l11, iArr, str2));
        TextView i14 = w8.i.i((Activity) this.f12044b, "Save", true);
        i14.setTextSize(16.0f);
        i14.setMinHeight(0);
        i14.setGravity(17);
        ViewGroup.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, w8.i.e((Activity) this.f12044b, 50));
        AlertDialog create = new AlertDialog.Builder((Activity) this.f12044b).setView(linearLayout).create();
        w8.i.k((Activity) this.f12044b, create, false);
        i14.setOnClickListener(new u(create, vVar, iArr, iArr2, 1));
        linearLayout.addView(i14, layoutParams4);
        create.show();
    }

    public final void H() {
        if (((n8.a) this.f12044b).n()) {
            ((n8.a) this.f12044b).D();
            return;
        }
        Object obj = this.f12044b;
        FrameLayout frameLayout = ((n8.a) obj).f8024b.W;
        if (frameLayout == null) {
            return;
        }
        TextView textView = ((n8.a) obj).f8024b.f7762m0;
        ((n8.a) obj).t((Runnable) this.f12045c);
        if (frameLayout.getVisibility() == 0) {
            frameLayout.animate().alpha(0.0f).setDuration(180L).withEndAction(new p8.j(frameLayout, 0)).start();
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(0);
        frameLayout.animate().alpha(1.0f).setDuration(180L).start();
        ((n8.a) this.f12044b).r((Runnable) this.f12045c, 4000L);
    }

    public final void I() {
        n8.a aVar = (n8.a) this.f12044b;
        PlayerActivity playerActivity = aVar.f8024b;
        playerActivity.G0 = false;
        aVar.t(playerActivity.Q0);
        ImageView imageView = ((n8.a) this.f12044b).f8024b.f7768s0;
        if (imageView != null) {
            imageView.animate().cancel();
            imageView.setVisibility(8);
            imageView.setAlpha(1.0f);
        }
        g(true);
    }

    public final void J(int i10, int i11) {
        boolean z9;
        float f10;
        PlayerActivity playerActivity = ((n8.a) this.f12044b).f8024b;
        ImageView imageView = playerActivity.f7758i0;
        ImageView imageView2 = playerActivity.f7759j0;
        boolean z10 = false;
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = 1.0f;
        if (imageView != null) {
            imageView.setEnabled(z9);
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.38f;
            }
            imageView.setAlpha(f10);
        }
        if (i10 + 1 < i11) {
            z10 = true;
        }
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
            if (!z10) {
                f11 = 0.38f;
            }
            imageView2.setAlpha(f11);
        }
    }

    public final void K() {
        int i10;
        Object obj = this.f12044b;
        ImageView imageView = ((n8.a) obj).f8024b.f7757h0;
        if (imageView == null) {
            return;
        }
        Object f10 = ((n8.a) obj).f();
        if (f10 != null && ((c1.i) f10).h()) {
            i10 = R.drawable.exo_icon_pause;
        } else {
            i10 = R.drawable.ic_player_play_modern;
        }
        imageView.setImageResource(i10);
        imageView.clearColorFilter();
        imageView.setPadding(0, 0, 0, 0);
    }

    public final void L() {
        int i10;
        Object obj = this.f12044b;
        ImageView imageView = ((n8.a) obj).f8024b.f7769t0;
        p f10 = ((n8.a) obj).f();
        if (imageView != null && f10 != null) {
            j1.d0 d0Var = (j1.d0) f10;
            d0Var.h0();
            if (d0Var.Y > 0.0f) {
                i10 = R.drawable.ic_volume_up;
            } else {
                i10 = R.drawable.ic_volume_off;
            }
            imageView.setImageResource(i10);
            imageView.clearColorFilter();
        }
    }

    public final int M(Context context, com.google.android.gms.common.api.g gVar) {
        w7.b.s(context);
        w7.b.s(gVar);
        int i10 = 0;
        if (!gVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = gVar.getMinApkVersion();
        int i11 = ((SparseIntArray) this.f12044b).get(minApkVersion, -1);
        if (i11 == -1) {
            int i12 = 0;
            while (true) {
                if (i12 < ((SparseIntArray) this.f12044b).size()) {
                    int keyAt = ((SparseIntArray) this.f12044b).keyAt(i12);
                    if (keyAt > minApkVersion && ((SparseIntArray) this.f12044b).get(keyAt) == 0) {
                        break;
                    }
                    i12++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                i11 = ((b5.e) this.f12045c).c(context, minApkVersion);
            } else {
                i11 = i10;
            }
            ((SparseIntArray) this.f12044b).put(minApkVersion, i11);
        }
        return i11;
    }

    @Override // e4.o
    public final void a(Bitmap bitmap, y3.d dVar) {
        IOException iOException = ((p4.e) this.f12045c).f8562b;
        if (iOException != null) {
            if (bitmap != null) {
                dVar.c(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    @Override // h8.d0
    public final a8.b b() {
        return (a8.b) this.f12044b;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public final ActivityRetainedComponent build() {
        h0.m((SavedStateHandleHolder) this.f12045c, SavedStateHandleHolder.class);
        return new x7.c((x7.g) this.f12044b);
    }

    @Override // h8.d0
    public final List c() {
        return Collections.emptyList();
    }

    @Override // h8.d0
    public final void d(boolean z9) {
        MainActivity mainActivity = (MainActivity) this.f12045c;
        a8.b bVar = (a8.b) this.f12044b;
        int i10 = MainActivity.f7741b0;
        mainActivity.W(bVar);
        ((MainActivity) this.f12045c).W.M();
    }

    public final TextView e(String str, View.OnClickListener onClickListener) {
        TextView l10 = w8.i.l((Context) this.f12044b, str, 14, w8.i.f11065e, 1);
        l10.setBackground(w8.i.j(Color.argb(35, 14, 165, 233), w8.i.e((Context) this.f12044b, 14)));
        l10.setPadding(w8.i.e((Context) this.f12044b, 14), w8.i.e((Context) this.f12044b, 8), w8.i.e((Context) this.f12044b, 14), w8.i.e((Context) this.f12044b, 8));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, w8.i.e((Context) this.f12044b, 38));
        layoutParams.setMargins(0, 0, w8.i.e((Context) this.f12044b, 8), 0);
        l10.setLayoutParams(layoutParams);
        l10.setOnClickListener(onClickListener);
        return l10;
    }

    public final void f(Object obj, String str) {
        ((List) this.f12044b).add(str + "=" + String.valueOf(obj));
    }

    public final void g(boolean z9) {
        ImageView imageView = ((n8.a) this.f12044b).f8024b.f7767r0;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.ic_unlock);
            imageView.clearColorFilter();
        }
        boolean n9 = ((n8.a) this.f12044b).n();
        FrameLayout frameLayout = ((n8.a) this.f12044b).f8024b.W;
        if (n9) {
            if (frameLayout != null) {
                frameLayout.animate().cancel();
                if (z9) {
                    frameLayout.animate().alpha(0.0f).setDuration(160L).withEndAction(new m0(27, this, frameLayout)).start();
                } else {
                    frameLayout.setAlpha(0.0f);
                    frameLayout.setVisibility(8);
                }
            }
            TextView textView = ((n8.a) this.f12044b).f8024b.f7762m0;
            if (textView != null) {
                textView.setVisibility(8);
            }
            PlayerActivity playerActivity = ((n8.a) this.f12044b).f8024b;
            q8.c cVar = playerActivity.f7763n0;
            if (cVar != null) {
                cVar.animate().cancel();
                playerActivity.f7763n0.setVisibility(8);
                playerActivity.f7763n0.setAlpha(1.0f);
            }
            ((n8.a) this.f12044b).D();
            return;
        }
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            frameLayout.setVisibility(0);
            if (z9) {
                frameLayout.setAlpha(0.0f);
                frameLayout.animate().alpha(1.0f).setDuration(160L).start();
            } else {
                frameLayout.setAlpha(1.0f);
            }
        }
        p f10 = ((n8.a) this.f12044b).f();
        if (f10 != null) {
            n8.a aVar = (n8.a) this.f12044b;
            ((j1.d0) f10).y();
            aVar.f8024b.G.k();
        }
    }

    @Override // h8.d0
    public final Context getContext() {
        return (MainActivity) this.f12045c;
    }

    @Override // e4.o
    public final void h() {
        e4.v vVar = (e4.v) this.f12044b;
        synchronized (vVar) {
            vVar.f3528c = vVar.f3526a.length;
        }
    }

    public final void i(LinearLayout linearLayout) {
        String str;
        String str2;
        int i10 = 0;
        ((Context) this.f12044b).getSharedPreferences("crash_logger", 0).edit().putBoolean("has_new_crash", false).apply();
        w8.d.f11048d = "CrashLogs";
        linearLayout.removeAllViews();
        l8.z zVar = (l8.z) this.f12045c;
        zVar.getClass();
        int i11 = MainActivity.f7741b0;
        zVar.f7036b.z("Crash Reports");
        LinearLayout linearLayout2 = new LinearLayout((Context) this.f12044b);
        int i12 = 1;
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(w8.i.e((Context) this.f12044b, 24), w8.i.e((Context) this.f12044b, 24), w8.i.e((Context) this.f12044b, 24), w8.i.e((Context) this.f12044b, 40));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout((Context) this.f12044b);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setBackground(w8.i.j(w8.i.f11063c, w8.i.e((Context) this.f12044b, 16)));
        linearLayout3.setPadding(w8.i.e((Context) this.f12044b, 18), w8.i.e((Context) this.f12044b, 4), w8.i.e((Context) this.f12044b, 8), w8.i.e((Context) this.f12044b, 4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, w8.i.e((Context) this.f12044b, 56));
        layoutParams.setMargins(0, w8.i.e((Context) this.f12044b, 8), 0, 0);
        linearLayout2.addView(linearLayout3, layoutParams);
        Context context = (Context) this.f12044b;
        int i13 = w8.i.f11068h;
        TextView l10 = w8.i.l(context, "", 14, i13, 1);
        a3.g.v(0, -2, 1.0f, linearLayout3, l10);
        TextView l11 = w8.i.l((Context) this.f12044b, "Clear All", 14, w8.i.f11065e, 1);
        l11.setBackground(w8.i.j(Color.argb(35, 14, 165, 233), w8.i.e((Context) this.f12044b, 14)));
        l11.setPadding(w8.i.e((Context) this.f12044b, 16), w8.i.e((Context) this.f12044b, 8), w8.i.e((Context) this.f12044b, 16), w8.i.e((Context) this.f12044b, 8));
        l11.setOnClickListener(new r(22, this, linearLayout));
        linearLayout3.addView(l11);
        LinearLayout linearLayout4 = new LinearLayout((Context) this.f12044b);
        linearLayout4.setOrientation(1);
        linearLayout4.setPadding(0, w8.i.e((Context) this.f12044b, 8), 0, 0);
        a3.g.w(-1, -2, linearLayout2, linearLayout4);
        File[] d10 = w8.d.d((Context) this.f12044b);
        if (d10.length == 0) {
            l10.setText("No crash logs");
            LinearLayout linearLayout5 = new LinearLayout((Context) this.f12044b);
            linearLayout5.setOrientation(1);
            linearLayout5.setGravity(17);
            linearLayout5.setPadding(0, w8.i.e((Context) this.f12044b, 64), 0, 0);
            linearLayout5.addView(w8.i.l((Context) this.f12044b, "No crash reports", 18, i13, 1));
            linearLayout4.addView(linearLayout5, new LinearLayout.LayoutParams(-1, -2));
            return;
        }
        l10.setText(d10.length + " crash log(s)");
        int length = d10.length;
        int i14 = 16;
        final int i15 = 0;
        while (i10 < length) {
            final File file = d10[i10];
            LinearLayout linearLayout6 = new LinearLayout((Context) this.f12044b);
            linearLayout6.setOrientation(i12);
            linearLayout6.setBackground(w8.i.j(w8.i.f11063c, w8.i.e((Context) this.f12044b, 12)));
            linearLayout6.setPadding(w8.i.e((Context) this.f12044b, i14), w8.i.e((Context) this.f12044b, 14), w8.i.e((Context) this.f12044b, i14), w8.i.e((Context) this.f12044b, 14));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(w8.i.e((Context) this.f12044b, 20), i15, w8.i.e((Context) this.f12044b, 20), w8.i.e((Context) this.f12044b, 12));
            linearLayout6.setLayoutParams(layoutParams2);
            LinearLayout linearLayout7 = new LinearLayout((Context) this.f12044b);
            linearLayout7.setOrientation(i15);
            linearLayout7.setGravity(16);
            linearLayout6.addView(linearLayout7, new LinearLayout.LayoutParams(-1, -2));
            a3.g.v(i15, -2, 1.0f, linearLayout7, w8.i.l((Context) this.f12044b, new SimpleDateFormat("MMM dd, yyyy  hh:mm a", Locale.US).format(new Date(file.lastModified())), 14, -1, 1));
            long length2 = file.length() / 1024;
            Context context2 = (Context) this.f12044b;
            if (length2 > 0) {
                str = length2 + " KB";
            } else {
                str = "<1 KB";
            }
            linearLayout7.addView(w8.i.l(context2, str, 11, w8.i.f11068h, i15));
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                str2 = bufferedReader.readLine();
                bufferedReader.close();
                if (str2 != null && str2.length() > 120) {
                    str2 = str2.substring(i15, 120) + "...";
                }
            } catch (Exception unused) {
                str2 = null;
            }
            if (str2 != null && !str2.isEmpty()) {
                TextView l12 = w8.i.l((Context) this.f12044b, str2, 12, -6710887, i15);
                l12.setMaxLines(1);
                l12.setEllipsize(TextUtils.TruncateAt.END);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(i15, w8.i.e((Context) this.f12044b, 6), i15, i15);
                linearLayout6.addView(l12, layoutParams3);
            }
            LinearLayout linearLayout8 = new LinearLayout((Context) this.f12044b);
            linearLayout8.setOrientation(i15);
            linearLayout8.setGravity(8388613);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(i15, w8.i.e((Context) this.f12044b, 10), i15, i15);
            linearLayout6.addView(linearLayout8, layoutParams4);
            linearLayout8.addView(e("View", new m8.i(this, linearLayout, file, i15)));
            linearLayout8.addView(e("Copy", new View.OnClickListener(this) { // from class: m8.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z3.e f7635b;

                {
                    this.f7635b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i16 = i15;
                    File file2 = file;
                    z3.e eVar = this.f7635b;
                    switch (i16) {
                        case 0:
                            eVar.k(file2);
                            return;
                        case 1:
                            eVar.r(file2);
                            return;
                        default:
                            eVar.E(file2);
                            return;
                    }
                }
            }));
            final int i16 = 1;
            linearLayout8.addView(e("Download", new View.OnClickListener(this) { // from class: m8.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z3.e f7635b;

                {
                    this.f7635b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162 = i16;
                    File file2 = file;
                    z3.e eVar = this.f7635b;
                    switch (i162) {
                        case 0:
                            eVar.k(file2);
                            return;
                        case 1:
                            eVar.r(file2);
                            return;
                        default:
                            eVar.E(file2);
                            return;
                    }
                }
            }));
            final int i17 = 2;
            linearLayout8.addView(e("Share", new View.OnClickListener(this) { // from class: m8.j

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z3.e f7635b;

                {
                    this.f7635b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i162 = i17;
                    File file2 = file;
                    z3.e eVar = this.f7635b;
                    switch (i162) {
                        case 0:
                            eVar.k(file2);
                            return;
                        case 1:
                            eVar.r(file2);
                            return;
                        default:
                            eVar.E(file2);
                            return;
                    }
                }
            }));
            linearLayout8.addView(e("Delete", new m8.i(this, file, linearLayout)));
            linearLayout6.setOnClickListener(new m8.i(this, linearLayout, file, 2));
            linearLayout4.addView(linearLayout6);
            i10++;
            i15 = 0;
            i14 = 16;
            i12 = 1;
        }
    }

    public final String j(v3.i iVar) {
        String str;
        Object j4 = ((f0.c) this.f12045c).j();
        w7.b.q(j4);
        j jVar = (j) j4;
        try {
            iVar.a(jVar.f12053a);
            byte[] digest = jVar.f12053a.digest();
            char[] cArr = m.f8576b;
            synchronized (cArr) {
                for (int i10 = 0; i10 < digest.length; i10++) {
                    int i11 = digest[i10] & 255;
                    int i12 = i10 * 2;
                    char[] cArr2 = m.f8575a;
                    cArr[i12] = cArr2[i11 >>> 4];
                    cArr[i12 + 1] = cArr2[i11 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((f0.c) this.f12045c).b(jVar);
        }
    }

    public final void k(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (sb.length() > 102400) {
                    sb.append("\n... [TRUNCATED - file too large]");
                    break;
                } else {
                    sb.append(readLine);
                    sb.append("\n");
                }
            }
            bufferedReader.close();
        } catch (Exception e10) {
            Log.e("MainActivity", "exception", e10);
        }
        ((ClipboardManager) ((Context) this.f12044b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Crash Report", sb.toString()));
    }

    public final TextView n(String str, View.OnClickListener onClickListener) {
        TextView l10 = w8.i.l((Context) this.f12044b, str, 14, w8.i.f11065e, 1);
        l10.setPadding(w8.i.e((Context) this.f12044b, 14), w8.i.e((Context) this.f12044b, 8), w8.i.e((Context) this.f12044b, 14), w8.i.e((Context) this.f12044b, 8));
        l10.setOnClickListener(onClickListener);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    @Override // g0.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g0.k2 o(android.view.View r13, g0.k2 r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f12044b
            c1.r r0 = (c1.r) r0
            java.lang.Object r1 = r12.f12045c
            z1.h r1 = (z1.h) r1
            int r2 = r1.f11924a
            int r3 = r1.f11926c
            int r1 = r1.f11927d
            r0.getClass()
            r4 = 7
            z.d r4 = r14.a(r4)
            r5 = 32
            z.d r5 = r14.a(r5)
            java.lang.Object r6 = r0.f1886b
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r6
            int r7 = r4.f11857b
            r6.f2676w = r7
            boolean r6 = p7.a0.J(r13)
            int r7 = r13.getPaddingBottom()
            int r8 = r13.getPaddingLeft()
            int r9 = r13.getPaddingRight()
            java.lang.Object r10 = r0.f1886b
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r10
            boolean r11 = r10.o
            if (r11 == 0) goto L49
            int r7 = r14.b()
            r10.f2675v = r7
            java.lang.Object r7 = r0.f1886b
            com.google.android.material.bottomsheet.BottomSheetBehavior r7 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r7
            int r7 = r7.f2675v
            int r7 = r7 + r1
        L49:
            java.lang.Object r1 = r0.f1886b
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            boolean r10 = r1.f2669p
            int r11 = r4.f11856a
            if (r10 == 0) goto L59
            if (r6 == 0) goto L57
            r8 = r3
            goto L58
        L57:
            r8 = r2
        L58:
            int r8 = r8 + r11
        L59:
            boolean r1 = r1.f2670q
            int r10 = r4.f11858c
            if (r1 == 0) goto L65
            if (r6 == 0) goto L62
            goto L63
        L62:
            r2 = r3
        L63:
            int r9 = r2 + r10
        L65:
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            java.lang.Object r2 = r0.f1886b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            boolean r3 = r2.f2672s
            r6 = 1
            if (r3 == 0) goto L7c
            int r3 = r1.leftMargin
            if (r3 == r11) goto L7c
            r1.leftMargin = r11
            r3 = r6
            goto L7d
        L7c:
            r3 = 0
        L7d:
            boolean r11 = r2.f2673t
            if (r11 == 0) goto L88
            int r11 = r1.rightMargin
            if (r11 == r10) goto L88
            r1.rightMargin = r10
            r3 = r6
        L88:
            boolean r2 = r2.f2674u
            if (r2 == 0) goto L95
            int r2 = r1.topMargin
            int r4 = r4.f11857b
            if (r2 == r4) goto L95
            r1.topMargin = r4
            goto L96
        L95:
            r6 = r3
        L96:
            if (r6 == 0) goto L9b
            r13.setLayoutParams(r1)
        L9b:
            int r1 = r13.getPaddingTop()
            r13.setPadding(r8, r1, r9, r7)
            boolean r13 = r0.f1885a
            if (r13 == 0) goto Lae
            java.lang.Object r1 = r0.f1886b
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            int r2 = r5.f11859d
            r1.f2667m = r2
        Lae:
            java.lang.Object r0 = r0.f1886b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            boolean r1 = r0.o
            if (r1 != 0) goto Lb8
            if (r13 == 0) goto Lbb
        Lb8:
            r0.G()
        Lbb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.e.o(android.view.View, g0.k2):g0.k2");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        p6.c cVar = (p6.c) this.f12044b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12045c;
        synchronized (cVar.f8609f) {
            cVar.f8608e.remove(taskCompletionSource);
        }
    }

    @Override // v3.c
    public final boolean p(Object obj, File file, l lVar) {
        return ((o) this.f12045c).p(new e4.d(((BitmapDrawable) ((e0) obj).get()).getBitmap(), (y3.d) this.f12044b), file, lVar);
    }

    @Override // v3.o
    public final int q(l lVar) {
        return ((o) this.f12045c).q(lVar);
    }

    public final void r(File file) {
        try {
            String name = file.getName();
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", name);
                contentValues.put("mime_type", "text/plain");
                Uri insert = ((Context) this.f12044b).getContentResolver().insert(f0.g(), contentValues);
                if (insert != null) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        OutputStream openOutputStream = ((Context) this.f12044b).getContentResolver().openOutputStream(insert);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                } else {
                                    openOutputStream.write(bArr, 0, read);
                                }
                            }
                            if (openOutputStream != null) {
                                openOutputStream.close();
                            }
                            fileInputStream.close();
                            Toast.makeText((Context) this.f12044b, "Saved to Downloads", 0).show();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            }
            File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), name);
            FileInputStream fileInputStream2 = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr2 = new byte[4096];
            while (true) {
                int read2 = fileInputStream2.read(bArr2);
                if (read2 > 0) {
                    fileOutputStream.write(bArr2, 0, read2);
                } else {
                    fileInputStream2.close();
                    fileOutputStream.close();
                    Toast.makeText((Context) this.f12044b, "Saved to Downloads", 0).show();
                    return;
                }
            }
        } catch (Exception unused) {
            Toast.makeText((Context) this.f12044b, "Download failed", 0).show();
        }
    }

    public final int s() {
        boolean z9;
        PlayerActivity playerActivity = ((n8.a) this.f12044b).f8024b;
        if (playerActivity == null) {
            return R.drawable.ic_player_fullscreen_enter_modern;
        }
        if (playerActivity.getResources().getConfiguration().orientation == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return R.drawable.ic_player_fullscreen_enter_modern;
        }
        return R.drawable.ic_player_fullscreen_exit_modern;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public final ActivityRetainedComponentBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
        savedStateHandleHolder.getClass();
        this.f12045c = savedStateHandleHolder;
        return this;
    }

    @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    public final ServiceComponentBuilder service(Service service) {
        service.getClass();
        this.f12045c = service;
        return this;
    }

    public final synchronized ArrayList t(Class cls) {
        return ((c0) this.f12044b).d(cls);
    }

    public final String toString() {
        switch (this.f12043a) {
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f12045c.getClass().getSimpleName());
                sb.append('{');
                int size = ((List) this.f12044b).size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) ((List) this.f12044b).get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final synchronized List u(String str) {
        List list;
        if (!((List) this.f12044b).contains(str)) {
            ((List) this.f12044b).add(str);
        }
        list = (List) ((Map) this.f12045c).get(str);
        if (list == null) {
            list = new ArrayList();
            ((Map) this.f12045c).put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList v(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z9;
        arrayList = new ArrayList();
        Iterator it = ((List) this.f12044b).iterator();
        while (it.hasNext()) {
            List<k4.c> list = (List) ((Map) this.f12045c).get((String) it.next());
            if (list != null) {
                for (k4.c cVar : list) {
                    if (cVar.f6472a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f6473b)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 && !arrayList.contains(cVar.f6473b)) {
                        arrayList.add(cVar.f6473b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final String w(v3.i iVar) {
        String str;
        synchronized (((p4.i) this.f12044b)) {
            str = (String) ((p4.i) this.f12044b).a(iVar);
        }
        if (str == null) {
            str = j(iVar);
        }
        synchronized (((p4.i) this.f12044b)) {
            ((p4.i) this.f12044b).d(iVar, str);
        }
        return str;
    }

    public final String x(String str) {
        int identifier = ((Resources) this.f12044b).getIdentifier(str, "string", (String) this.f12045c);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.f12044b).getString(identifier);
    }

    public final Window y() {
        PlayerActivity playerActivity = ((n8.a) this.f12044b).f8024b;
        if (playerActivity instanceof Activity) {
            return playerActivity.getWindow();
        }
        return null;
    }

    public final void z() {
        boolean z9;
        Object obj = this.f12044b;
        PlayerActivity playerActivity = ((n8.a) obj).f8024b;
        if (playerActivity == null) {
            ((n8.a) obj).f8024b.finish();
            return;
        }
        if (playerActivity.getResources().getConfiguration().orientation == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            PlayerActivity playerActivity2 = ((n8.a) this.f12044b).f8024b;
            if (playerActivity2.H0) {
                playerActivity2.H0 = false;
                playerActivity2.setRequestedOrientation(7);
                return;
            }
        }
        ((n8.a) this.f12044b).f8024b.setRequestedOrientation(-1);
        ((n8.a) this.f12044b).f8024b.finish();
    }

    @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
    /* renamed from: build, reason: collision with other method in class */
    public final ServiceComponent mo5build() {
        h0.m((Service) this.f12045c, Service.class);
        return new x7.e();
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f12043a = i10;
        this.f12044b = obj;
        this.f12045c = obj2;
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.f12043a = i10;
        this.f12044b = obj;
    }

    public /* synthetic */ e(MainActivity mainActivity, Object obj, int i10) {
        this.f12043a = i10;
        this.f12045c = mainActivity;
        this.f12044b = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(x7.g gVar) {
        this((Object) gVar, 18);
        this.f12043a = 18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(x7.g gVar, int i10) {
        this((Object) gVar, 19);
        this.f12043a = 19;
    }

    public e(Context context) {
        this.f12043a = 12;
        w7.b.s(context);
        Resources resources = context.getResources();
        this.f12044b = resources;
        this.f12045c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ e(Object obj) {
        this.f12043a = 11;
        w7.b.s(obj);
        this.f12045c = obj;
        this.f12044b = new ArrayList();
    }

    public e(t4.a aVar) {
        this.f12043a = 9;
        this.f12044b = Boolean.FALSE;
        t4.a aVar2 = t4.a.f10026c;
        aVar.getClass();
        this.f12044b = Boolean.valueOf(aVar.f10027a);
        this.f12045c = aVar.f10028b;
    }

    public e(int i10) {
        this.f12043a = i10;
        int i11 = 7;
        if (i10 == 7) {
            this.f12044b = new AtomicReference();
            this.f12045c = new n.e();
        } else if (i10 == 8) {
            this.f12044b = new ArrayList();
            this.f12045c = new HashMap();
        } else if (i10 == 9) {
            this.f12044b = Boolean.FALSE;
        } else {
            this.f12044b = new p4.i(1000L);
            this.f12045c = q6.g.o0(10, new k3.d(this, i11));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(f.c cVar) {
        this(new c0(cVar));
        this.f12043a = 2;
    }

    public e(c0 c0Var) {
        this.f12043a = 2;
        this.f12045c = new b0(3);
        this.f12044b = c0Var;
    }

    public e(n8.a aVar) {
        this.f12043a = 24;
        this.f12044b = aVar;
        this.f12045c = new p8.e(aVar, 1);
    }

    public e(y5.b bVar, y5.b bVar2) {
        this.f12043a = 14;
        bVar.getClass();
        bVar2.getClass();
        if (0.0f <= 0.0f) {
            this.f12044b = bVar;
            this.f12045c = bVar2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
