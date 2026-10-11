package h8;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import m8.k0;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5038a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5039b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f5040c;

    public h(j jVar) {
        this.f5040c = jVar;
        this.f5039b = jVar.getContext();
    }

    public final String a(String str) {
        switch (this.f5038a) {
            case 0:
                return str == null ? "" : str;
            default:
                return str == null ? "" : str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r25v0, types: [h8.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v1, types: [h8.h] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void b() {
        int i10;
        String str;
        int i11;
        String str2;
        h hVar = this;
        d0 d0Var = hVar.f5040c;
        a8.b b10 = d0Var.b();
        List c6 = d0Var.c();
        if (c6 != null) {
            i10 = c6.size();
        } else {
            i10 = 0;
        }
        Context context = hVar.f5039b;
        a8.b e10 = w7.c.e(context, b10);
        ?? r02 = 1;
        final String[] strArr = new String[1];
        if (e10 == null || (str = e10.N) == null) {
            str = "watching";
        }
        strArr[0] = str;
        final int[] iArr = new int[1];
        if (e10 != null) {
            i11 = e10.O;
        } else {
            i11 = 0;
        }
        iArr[0] = i11;
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(w8.i.e(context, 20), w8.i.e(context, 10), w8.i.e(context, 20), w8.i.e(context, 28));
        View view = new View(context);
        int i12 = w8.i.f11064d;
        view.setBackground(w8.i.j(i12, w8.i.e(context, 3)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e(context, 40), w8.i.e(context, 4));
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, 0, 0, w8.i.e(context, 18));
        linearLayout.addView(view, layoutParams);
        ?? linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setBackground(w8.i.j(i12, w8.i.e(context, 8)));
        imageView.setClipToOutline(true);
        ((com.bumptech.glide.l) ((com.bumptech.glide.l) com.bumptech.glide.b.d(context).n(b10.f170c).j()).i(120, 168)).x(imageView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(w8.i.e(context, 44), w8.i.e(context, 62));
        layoutParams2.setMargins(0, 0, w8.i.e(context, 12), 0);
        linearLayout2.addView(imageView, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        if (e10 != null) {
            str2 = "EDIT MY LIST ENTRY";
        } else {
            str2 = "ADD TO MY LIST";
        }
        TextView l10 = w8.i.l(context, str2, 11, w8.i.f11065e, 1);
        l10.setLetterSpacing(0.06f);
        linearLayout3.addView(l10);
        TextView l11 = w8.i.l(context, hVar.a(b10.f168a), 16, -1, 1);
        l11.setSingleLine(true);
        l11.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, w8.i.e(context, 3), 0, 0);
        linearLayout3.addView(l11, layoutParams3);
        TextView l12 = w8.i.l(context, "STATUS", 11, w8.i.f11068h, 1);
        l12.setLetterSpacing(0.06f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, w8.i.e(context, 22), 0, w8.i.e(context, 10));
        linearLayout.addView(l12, layoutParams4);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setFocusable(false);
        linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setGravity(16);
        horizontalScrollView.addView(linearLayout4, new LinearLayout.LayoutParams(-2, -2));
        final String[] strArr2 = {"watching", "completed", "plan_to_watch", "on_hold", "dropped"};
        String[] strArr3 = {"Watching", "Completed", "Plan", "Hold", "Dropped"};
        int i13 = 5;
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(1);
        final int i14 = 0;
        ?? r62 = new TextView[5];
        LinearLayout linearLayout6 = linearLayout;
        ?? r9 = hVar;
        while (i14 < i13) {
            final LinearLayout linearLayout7 = linearLayout5;
            ?? l13 = w8.i.l(context, strArr3[i14], 13, -1, r02);
            l13.setGravity(17);
            l13.setSingleLine(r02);
            l13.setPadding(w8.i.e(context, 12), w8.i.e(context, 10), w8.i.e(context, 12), w8.i.e(context, 10));
            r62[i14] = l13;
            r9.d(l13, strArr[0].equals(strArr2[i14]));
            w8.i.d(l13);
            a8.b bVar = e10;
            int i15 = i14;
            a8.b bVar2 = b10;
            final int i16 = i10;
            final TextView[] textViewArr = r62;
            ?? r92 = linearLayout4;
            int i17 = i10;
            LinearLayout linearLayout8 = linearLayout6;
            l13.setOnClickListener(new View.OnClickListener() { // from class: h8.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    boolean z9;
                    h hVar2 = h.this;
                    hVar2.getClass();
                    String[] strArr4 = strArr2;
                    int i18 = i14;
                    String str3 = strArr4[i18];
                    String[] strArr5 = strArr;
                    strArr5[0] = str3;
                    boolean equals = "completed".equals(strArr4[i18]);
                    int i19 = i16;
                    int[] iArr2 = iArr;
                    if (equals && i19 > 0) {
                        iArr2[0] = i19;
                    }
                    for (int i20 = 0; i20 < 5; i20++) {
                        TextView textView = textViewArr[i20];
                        if (i20 == i18) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        hVar2.d(textView, z9);
                    }
                    hVar2.e(linearLayout7, strArr5, iArr2, i19);
                }
            });
            r92.addView(l13, new LinearLayout.LayoutParams(-2, -2));
            if (i15 < 4) {
                View view2 = new View(context);
                view2.setLayoutParams(new LinearLayout.LayoutParams(w8.i.e(context, 8), 0));
                r92.addView(view2);
            }
            i14 = i15 + 1;
            r02 = 1;
            linearLayout4 = r92;
            linearLayout6 = linearLayout8;
            b10 = bVar2;
            i13 = 5;
            e10 = bVar;
            linearLayout5 = linearLayout7;
            r62 = textViewArr;
            i10 = i17;
            r9 = this;
        }
        LinearLayout linearLayout9 = linearLayout5;
        a8.b bVar3 = b10;
        int i18 = i10;
        a8.b bVar4 = e10;
        LinearLayout linearLayout10 = linearLayout6;
        a3.g.w(-1, -2, linearLayout10, linearLayout9);
        e(linearLayout9, strArr, iArr, i18);
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        TextView i19 = w8.i.i(context, "Save", true);
        i19.setTextSize(16.0f);
        i19.setMinHeight(0);
        i19.setGravity(17);
        w8.i.d(i19);
        i19.setOnClickListener(new a0(this, bVar3, strArr, iArr, alertDialogArr, 0));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, w8.i.e(context, 52));
        layoutParams5.setMargins(0, w8.i.e(context, 26), 0, 0);
        linearLayout10.addView(i19, layoutParams5);
        if (bVar4 != null) {
            TextView l14 = w8.i.l(context, "Remove from My List", 14, w8.i.f11068h, 1);
            l14.setGravity(17);
            l14.setPadding(0, w8.i.e(context, 14), 0, 0);
            w8.i.b(l14);
            l14.setOnClickListener(new f8.d((Object) this, bVar3, alertDialogArr, 3));
            linearLayout10.addView(l14, new LinearLayout.LayoutParams(-1, -2));
        }
        AlertDialog create = new AlertDialog.Builder(context, R.style.BottomSheetDialogTheme).setView(linearLayout10).create();
        alertDialogArr[0] = create;
        w8.i.k(context, create, true);
        create.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0058, code lost:
    
        if (r5.matches(".*(19|20)\\d{2}.*") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r14 = this;
            h8.d0 r0 = r14.f5040c
            h8.j r0 = (h8.j) r0
            a8.b r0 = r0.b()
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r2 = r14.f5039b
            r1.<init>(r2)
            r3 = 1
            r1.setOrientation(r3)
            r4 = 22
            int r5 = w8.i.e(r2, r4)
            r6 = 18
            int r6 = w8.i.e(r2, r6)
            int r7 = w8.i.e(r2, r4)
            int r4 = w8.i.e(r2, r4)
            r1.setPadding(r5, r6, r7, r4)
            java.lang.String r4 = r0.f168a
            r5 = 20
            r6 = -1
            android.widget.TextView r4 = w8.i.l(r2, r4, r5, r6, r3)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r5.<init>(r6, r7)
            r1.addView(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.f176z
            if (r5 == 0) goto L5b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4c
            goto L5b
        L4c:
            java.lang.String r5 = r0.f176z
            java.lang.String r5 = r5.trim()
            java.lang.String r8 = ".*(19|20)\\d{2}.*"
            boolean r8 = r5.matches(r8)
            if (r8 == 0) goto L5b
            goto L5d
        L5b:
            java.lang.String r5 = "Unknown"
        L5d:
            r4.append(r5)
            java.lang.String r5 = "  •  "
            r4.append(r5)
            java.lang.String r8 = r0.f175y
            java.lang.String r8 = r14.a(r8)
            r4.append(r8)
            r4.append(r5)
            java.lang.String r5 = r0.f172e
            java.lang.String r5 = r14.a(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            int r5 = w8.i.f11068h
            r8 = 13
            android.widget.TextView r4 = w8.i.l(r2, r4, r8, r5, r3)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r6, r7)
            r9 = 10
            int r10 = w8.i.e(r2, r9)
            r11 = 14
            int r12 = w8.i.e(r2, r11)
            r13 = 0
            r8.setMargins(r13, r10, r13, r12)
            r1.addView(r4, r8)
            java.lang.String r4 = ""
            r8 = 15
            android.widget.TextView r4 = w8.i.l(r2, r4, r8, r6, r13)
            java.lang.String r0 = r0.f171d
            java.lang.String r0 = r14.a(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r4.setText(r0)
            r0 = 3
            int r0 = w8.i.e(r2, r0)
            float r0 = (float) r0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4.setLineSpacing(r0, r8)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r7)
            r1.addView(r4, r0)
            java.lang.String r0 = "Close"
            android.widget.TextView r0 = w8.i.l(r2, r0, r11, r5, r3)
            r4 = 17
            r0.setGravity(r4)
            r4 = 16
            int r4 = w8.i.e(r2, r4)
            r0.setPadding(r13, r4, r13, r13)
            w8.i.b(r0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r6, r7)
            int r5 = w8.i.e(r2, r9)
            r4.topMargin = r5
            r1.addView(r0, r4)
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r5 = 2131951897(0x7f130119, float:1.9540221E38)
            r4.<init>(r2, r5)
            android.app.AlertDialog$Builder r1 = r4.setView(r1)
            android.app.AlertDialog r1 = r1.create()
            w8.i.k(r2, r1, r3)
            h8.g r2 = new h8.g
            r2.<init>(r1, r13)
            r0.setOnClickListener(r2)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.h.c():void");
    }

    public final void d(TextView textView, boolean z9) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = this.f5039b;
        gradientDrawable.setCornerRadius(w8.i.e(context, 10));
        if (z9) {
            gradientDrawable.setColor(w8.i.f11070j);
            gradientDrawable.setStroke(w8.i.e(context, 1), w8.i.f11065e);
            textView.setTextColor(-1);
        } else {
            gradientDrawable.setColor(w8.i.f11064d);
            textView.setTextColor(w8.i.f11068h);
        }
        textView.setBackground(gradientDrawable);
    }

    public final void e(LinearLayout linearLayout, String[] strArr, final int[] iArr, final int i10) {
        boolean z9;
        String str;
        linearLayout.removeAllViews();
        if (!"plan_to_watch".equals(strArr[0]) && !"dropped".equals(strArr[0])) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return;
        }
        Context context = this.f5039b;
        View view = new View(context);
        int i11 = w8.i.f11064d;
        view.setBackgroundColor(i11);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(0, w8.i.e(context, 22), 0, 0);
        linearLayout.addView(view, layoutParams);
        int i12 = w8.i.f11068h;
        TextView l10 = w8.i.l(context, "EPISODE PROGRESS", 11, i12, 1);
        l10.setLetterSpacing(0.06f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, w8.i.e(context, 18), 0, w8.i.e(context, 10));
        linearLayout.addView(l10, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(w8.i.e(context, 14), w8.i.e(context, 10), w8.i.e(context, 14), w8.i.e(context, 10));
        linearLayout2.setBackground(w8.i.j(i11, w8.i.e(context, 14)));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        if (i10 > 0) {
            str = a3.g.n(" / ", i10);
        } else {
            str = "";
        }
        final String str2 = str;
        a3.g.v(0, -2, 1.0f, linearLayout2, w8.i.l(context, "Tap the number to type it in", 12, i12, 0));
        TextView l11 = w8.i.l(context, "−", 20, -1, 1);
        l11.setGravity(17);
        l11.setBackground(w8.i.j(w8.i.f11061a, w8.i.e(context, 100)));
        w8.i.d(l11);
        linearLayout2.addView(l11, new LinearLayout.LayoutParams(w8.i.e(context, 34), w8.i.e(context, 34)));
        final TextView l12 = w8.i.l(context, iArr[0] + str2, 16, -1, 1);
        l12.setGravity(17);
        l12.setMinWidth(w8.i.e(context, 56));
        w8.i.d(l12);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(w8.i.e(context, 8), 0, w8.i.e(context, 8), 0);
        linearLayout2.addView(l12, layoutParams3);
        TextView l13 = w8.i.l(context, "+", 20, -1, 1);
        l13.setGravity(17);
        l13.setBackground(w8.i.j(w8.i.f11065e, w8.i.e(context, 100)));
        w8.i.d(l13);
        linearLayout2.addView(l13, new LinearLayout.LayoutParams(w8.i.e(context, 34), w8.i.e(context, 34)));
        l11.setOnClickListener(new f8.d(iArr, l12, str2, 4));
        l13.setOnClickListener(new b0(i10, l12, str2, iArr));
        l12.setOnClickListener(new View.OnClickListener() { // from class: h8.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h hVar = h.this;
                hVar.getClass();
                int[] iArr2 = iArr;
                int i13 = iArr2[0];
                k0 k0Var = new k0(iArr2, l12, str2, 2);
                Context context2 = hVar.f5039b;
                LinearLayout linearLayout3 = new LinearLayout(context2);
                linearLayout3.setOrientation(1);
                linearLayout3.setPadding(w8.i.e(context2, 24), w8.i.e(context2, 20), w8.i.e(context2, 24), w8.i.e(context2, 20));
                TextView l14 = w8.i.l(context2, "Episode Progress", 18, -1, 1);
                linearLayout3.addView(l14, r.f.c(l14, 17, -1, -2));
                EditText editText = new EditText(context2);
                editText.setInputType(2);
                editText.setText(String.valueOf(i13));
                editText.setSelection(editText.getText().length());
                editText.setTextColor(-1);
                editText.setTextSize(20.0f);
                editText.setGravity(17);
                editText.setBackground(w8.i.j(w8.i.f11064d, w8.i.e(context2, 10)));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, w8.i.e(context2, 52));
                layoutParams4.setMargins(0, w8.i.e(context2, 16), 0, 0);
                linearLayout3.addView(editText, layoutParams4);
                int i14 = i10;
                if (i14 > 0) {
                    TextView l15 = w8.i.l(context2, a3.g.o("Max ", i14, " episodes"), 12, w8.i.f11068h, 0);
                    LinearLayout.LayoutParams c6 = r.f.c(l15, 17, -1, -2);
                    c6.setMargins(0, w8.i.e(context2, 8), 0, 0);
                    linearLayout3.addView(l15, c6);
                }
                TextView i15 = w8.i.i(context2, "Save", true);
                i15.setGravity(17);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, w8.i.e(context2, 50));
                layoutParams5.setMargins(0, w8.i.e(context2, 20), 0, 0);
                linearLayout3.addView(i15, layoutParams5);
                AlertDialog create = new AlertDialog.Builder(context2).setView(linearLayout3).create();
                w8.i.k(context2, create, false);
                i15.setOnClickListener(new b0(editText, i14, k0Var, create));
                create.show();
            }
        });
    }

    public h(d0 d0Var) {
        this.f5040c = d0Var;
        this.f5039b = d0Var.getContext();
    }
}
