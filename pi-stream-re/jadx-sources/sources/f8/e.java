package f8;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
import androidx.lifecycle.a1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import g0.n0;
import g0.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import msr.pistream.app.R;
import msr.pistream.app.viewmodel.AuthViewModel;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class e extends g8.b implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int J0 = 0;
    public TextView A0;
    public TextView B0;
    public g8.c C0;
    public LinearLayout D0;
    public LinearLayout E0;
    public LinearLayout F0;
    public LinearLayout G0;
    public d5.b H0;
    public final c.e I0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f3943n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f3944o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f3945p0;

    /* renamed from: s0, reason: collision with root package name */
    public AuthViewModel f3948s0;

    /* renamed from: t0, reason: collision with root package name */
    public w.f f3949t0;

    /* renamed from: v0, reason: collision with root package name */
    public LinearLayout f3951v0;

    /* renamed from: w0, reason: collision with root package name */
    public EditText f3952w0;

    /* renamed from: x0, reason: collision with root package name */
    public EditText f3953x0;

    /* renamed from: y0, reason: collision with root package name */
    public EditText f3954y0;

    /* renamed from: z0, reason: collision with root package name */
    public EditText f3955z0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f3946q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f3947r0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public String f3950u0 = "signin";

    public e() {
        d.c cVar = new d.c();
        b bVar = new b(this, 2);
        o oVar = new o(this);
        if (this.f1029a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            u uVar = new u(this, oVar, atomicReference, cVar, bVar);
            if (this.f1029a >= 0) {
                uVar.a();
            } else {
                this.f1044j0.add(uVar);
            }
            this.I0 = new c.e(this, atomicReference, cVar, 2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // g8.b
    public final View W() {
        String str;
        FrameLayout frameLayout = new FrameLayout(this.f4484m0);
        frameLayout.setBackgroundColor(w8.i.f11062b);
        ScrollView scrollView = new ScrollView(this.f4484m0);
        scrollView.setVerticalScrollBarEnabled(false);
        int i10 = 1;
        scrollView.setFillViewport(true);
        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
        w.f fVar = new w.f(scrollView, 23);
        WeakHashMap weakHashMap = y0.f4277a;
        n0.u(frameLayout, fVar);
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        this.G0 = linearLayout2;
        linearLayout2.setOrientation(0);
        this.G0.setGravity(16);
        this.G0.setPadding(U(8), U(8), U(20), U(8));
        linearLayout.addView(this.G0, new LinearLayout.LayoutParams(-1, U(64)));
        linearLayout.addView(new View(this.f4484m0), new LinearLayout.LayoutParams(-1, 0, 0.5f));
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_back);
        imageView.setColorFilter(-1);
        imageView.setPadding(U(10), U(10), U(10), U(10));
        imageView.setOnClickListener(new c(this, 0));
        this.G0.addView(imageView, new LinearLayout.LayoutParams(U(48), U(48)));
        Context context = this.f4484m0;
        String str2 = "Sign In";
        if (this.f3950u0.equals("signin")) {
            str = "Sign In";
        } else {
            str = "Sign Up";
        }
        TextView l10 = w8.i.l(context, str, 22, -1, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(U(4), 0, 0, 0);
        this.G0.addView(l10, layoutParams);
        if (this.f3950u0.equals("signin")) {
            str2 = "Sign Up";
        }
        Context context2 = this.f4484m0;
        int i11 = w8.i.f11065e;
        TextView l11 = w8.i.l(context2, str2, 15, i11, 1);
        l11.setPadding(U(14), U(8), U(14), U(8));
        l11.setOnClickListener(new c(this, i10));
        this.G0.addView(l11, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        this.f3951v0 = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f3951v0.setPadding(U(28), U(12), U(28), U(32));
        a3.g.w(-1, -2, linearLayout, this.f3951v0);
        TextView l12 = w8.i.l(this.f4484m0, "", 14, i11, 0);
        this.A0 = l12;
        l12.setVisibility(8);
        r.f.i(-1, -2, this.f3951v0, this.A0);
        g8.c h10 = w8.i.h(this.f4484m0, 48);
        this.C0 = h10;
        h10.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(this.f4484m0);
        frameLayout2.addView(this.C0, new FrameLayout.LayoutParams(U(48), U(48), 17));
        this.f3951v0.addView(frameLayout2, new LinearLayout.LayoutParams(-1, U(70)));
        if ("signup".equals(this.f3950u0)) {
            Z();
        } else {
            Y();
        }
        linearLayout.addView(new View(this.f4484m0), new LinearLayout.LayoutParams(-1, 0, 0.5f));
        return frameLayout;
    }

    public final LinearLayout X() {
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        this.D0 = linearLayout;
        linearLayout.setGravity(17);
        this.D0.setBackground(w8.i.j(w8.i.f11063c, U(14)));
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_google);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.D0.addView(imageView, new LinearLayout.LayoutParams(U(24), U(24)));
        r.f.i(-2, -2, this.D0, w8.i.l(this.f4484m0, "  Continue with Google", 16, -1, 1));
        this.D0.setOnClickListener(new c(this, 6));
        return this.D0;
    }

    public final void Y() {
        this.f3951v0.addView(X(), new LinearLayout.LayoutParams(-1, U(58)));
        LinearLayout linearLayout = this.f3951v0;
        LinearLayout c02 = c0("or");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, U(24), 0, 0);
        linearLayout.addView(c02, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        this.F0 = linearLayout2;
        linearLayout2.setGravity(17);
        this.F0.setBackground(w8.i.j(w8.i.f11065e, U(100)));
        this.F0.addView(w8.i.l(this.f4484m0, "Sign in with password", 16, -1, 1), new LinearLayout.LayoutParams(-2, -2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, U(58));
        layoutParams2.setMargins(0, U(20), 0, 0);
        this.f3951v0.addView(this.F0, layoutParams2);
        this.F0.setOnClickListener(new c(this, 3));
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        this.E0 = linearLayout3;
        linearLayout3.setOrientation(1);
        this.E0.setVisibility(8);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, U(20), 0, 0);
        this.f3951v0.addView(this.E0, layoutParams3);
        EditText a02 = a0(33, "Email address");
        this.f3953x0 = a02;
        this.E0.addView(a02, new LinearLayout.LayoutParams(-1, -2));
        this.f3954y0 = b0("Password");
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, U(14), 0, 0);
        this.E0.addView((View) this.f3954y0.getTag(), layoutParams4);
        TextView l10 = w8.i.l(this.f4484m0, "Forgot Password?", 14, w8.i.f11068h, 0);
        l10.setGravity(8388613);
        l10.setPadding(0, U(10), 0, 0);
        l10.setOnClickListener(new c(this, 4));
        r.f.i(-1, -2, this.E0, l10);
        TextView i10 = w8.i.i(this.f4484m0, "Sign In", true);
        this.B0 = i10;
        i10.setTextSize(17.0f);
        this.B0.setGravity(17);
        this.B0.setMinHeight(U(58));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, U(58));
        layoutParams5.setMargins(0, U(20), 0, 0);
        this.E0.addView(this.B0, layoutParams5);
        this.B0.setOnClickListener(new c(this, 5));
    }

    public final void Z() {
        EditText a02 = a0(97, "Display name");
        this.f3952w0 = a02;
        this.f3951v0.addView(a02, new LinearLayout.LayoutParams(-1, -2));
        this.f3953x0 = a0(33, "Email");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, U(14), 0, 0);
        this.f3951v0.addView(this.f3953x0, layoutParams);
        this.f3954y0 = b0("Password");
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, U(14), 0, 0);
        this.f3951v0.addView((View) this.f3954y0.getTag(), layoutParams2);
        this.f3955z0 = b0("Retype password");
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, U(14), 0, 0);
        this.f3951v0.addView((View) this.f3955z0.getTag(), layoutParams3);
        TextView i10 = w8.i.i(this.f4484m0, "Sign up", true);
        this.B0 = i10;
        i10.setTextSize(17.0f);
        this.B0.setGravity(17);
        this.B0.setMinHeight(U(58));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, U(58));
        layoutParams4.setMargins(0, U(24), 0, 0);
        this.f3951v0.addView(this.B0, layoutParams4);
        this.B0.setOnClickListener(new c(this, 2));
        LinearLayout linearLayout = this.f3951v0;
        LinearLayout c02 = c0("or continue with");
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, U(24), 0, 0);
        linearLayout.addView(c02, layoutParams5);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, U(58));
        layoutParams6.setMargins(0, U(20), 0, 0);
        this.f3951v0.addView(X(), layoutParams6);
    }

    public final EditText a0(int i10, String str) {
        EditText editText = new EditText(this.f4484m0);
        editText.setHint(str);
        editText.setHintTextColor(w8.i.f11068h);
        editText.setTextColor(-1);
        editText.setBackground(w8.i.j(w8.i.f11063c, U(14)));
        editText.setPadding(U(20), U(16), U(20), U(16));
        editText.setTextSize(16.0f);
        editText.setInputType(i10);
        editText.setSingleLine(true);
        editText.setTypeface(Typeface.DEFAULT);
        return editText;
    }

    public final EditText b0(String str) {
        FrameLayout frameLayout = new FrameLayout(this.f4484m0);
        frameLayout.setBackground(w8.i.j(w8.i.f11063c, U(14)));
        EditText editText = new EditText(this.f4484m0);
        editText.setHint(str);
        int i10 = w8.i.f11068h;
        editText.setHintTextColor(i10);
        editText.setTextColor(-1);
        editText.setBackground(null);
        editText.setPadding(U(20), U(16), U(56), U(16));
        editText.setTextSize(16.0f);
        editText.setInputType(129);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editText.setSingleLine(true);
        editText.setTypeface(Typeface.DEFAULT);
        frameLayout.addView(editText, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_eye_hidden);
        imageView.setColorFilter(i10);
        imageView.setPadding(U(12), U(12), U(12), U(12));
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(U(48), U(48), 8388629));
        imageView.setOnClickListener(new d(new boolean[]{false}, editText, imageView, 0));
        editText.setTag(frameLayout);
        return editText;
    }

    public final LinearLayout c0(String str) {
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        linearLayout.setGravity(17);
        View view = new View(this.f4484m0);
        int i10 = w8.i.f11064d;
        view.setBackgroundColor(i10);
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, 1, 1.0f));
        linearLayout.addView(w8.i.l(this.f4484m0, r.f.e("  ", str, "  "), 14, w8.i.f11068h, 0), new LinearLayout.LayoutParams(-2, -2));
        View view2 = new View(this.f4484m0);
        view2.setBackgroundColor(i10);
        linearLayout.addView(view2, new LinearLayout.LayoutParams(0, 1, 1.0f));
        return linearLayout;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f3945p0 == null) {
            synchronized (this.f3946q0) {
                if (this.f3945p0 == null) {
                    this.f3945p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f3945p0;
    }

    public final void d0() {
        if (this.f3943n0 == null) {
            this.f3943n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f3944o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    public final void e0(boolean z9) {
        int i10;
        g8.c cVar = this.C0;
        if (cVar != null && this.B0 != null && this.f3953x0 != null && this.f3954y0 != null) {
            int i11 = 0;
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            cVar.setVisibility(i10);
            TextView textView = this.B0;
            if (z9) {
                i11 = 8;
            }
            textView.setVisibility(i11);
            boolean z10 = !z9;
            this.f3953x0.setEnabled(z10);
            this.f3954y0.setEnabled(z10);
        }
    }

    public final void f0(String str) {
        TextView textView = this.A0;
        if (textView == null) {
            return;
        }
        textView.setText(str);
        this.A0.setTextColor(w8.i.f11065e);
        this.A0.setVisibility(0);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f3945p0 == null) {
            synchronized (this.f3946q0) {
                if (this.f3945p0 == null) {
                    this.f3945p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f3945p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final androidx.lifecycle.y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f3944o0) {
            return null;
        }
        d0();
        return this.f3943n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f3943n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        d0();
        if (!this.f3947r0) {
            this.f3947r0 = true;
            f fVar = (f) generatedComponent();
            fVar.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        d0();
        if (!this.f3947r0) {
            this.f3947r0 = true;
            f fVar = (f) generatedComponent();
            fVar.getClass();
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        AuthViewModel authViewModel = (AuthViewModel) new a1(this).a(AuthViewModel.class);
        this.f3948s0 = authViewModel;
        boolean z9 = false;
        authViewModel.f7781c.e(this, new b(this, 0));
        this.f3948s0.f7782d.e(this, new b(this, 1));
        Bundle bundle2 = this.f1039f;
        if (bundle2 != null && "signup".equals(bundle2.getString("mode"))) {
            this.f3950u0 = "signup";
        }
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.B;
        new HashSet();
        new HashMap();
        w7.b.s(googleSignInOptions);
        HashSet hashSet = new HashSet(googleSignInOptions.f2333b);
        boolean z10 = googleSignInOptions.f2336e;
        boolean z11 = googleSignInOptions.f2337f;
        Account account = googleSignInOptions.f2334c;
        String str = googleSignInOptions.f2339y;
        HashMap e10 = GoogleSignInOptions.e(googleSignInOptions.f2340z);
        String str2 = googleSignInOptions.A;
        String string = O().getResources().getString(R.string.default_web_client_id);
        w7.b.o(string);
        String str3 = googleSignInOptions.f2338x;
        if (str3 == null || str3.equals(string)) {
            z9 = true;
        }
        w7.b.i("two different server client ids provided", z9);
        hashSet.add(GoogleSignInOptions.C);
        if (hashSet.contains(GoogleSignInOptions.F)) {
            Scope scope = GoogleSignInOptions.E;
            if (hashSet.contains(scope)) {
                hashSet.remove(scope);
            }
        }
        if (account == null || !hashSet.isEmpty()) {
            hashSet.add(GoogleSignInOptions.D);
        }
        this.H0 = new d5.b(this.f4484m0, new GoogleSignInOptions(3, new ArrayList(hashSet), account, true, z10, z11, string, str, e10, str2));
    }
}
