package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class SearchView extends g2 implements i.c {

    /* renamed from: x0, reason: collision with root package name */
    public static final o3 f347x0;
    public final SearchAutoComplete G;
    public final View H;
    public final View I;
    public final View J;
    public final ImageView K;
    public final ImageView L;
    public final ImageView M;
    public final ImageView N;
    public final View O;
    public s3 P;
    public final Rect Q;
    public final Rect R;
    public final int[] S;
    public final int[] T;
    public final ImageView U;
    public final Drawable V;
    public final int W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f348a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Intent f349b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Intent f350c0;

    /* renamed from: d0, reason: collision with root package name */
    public final CharSequence f351d0;

    /* renamed from: e0, reason: collision with root package name */
    public View.OnFocusChangeListener f352e0;

    /* renamed from: f0, reason: collision with root package name */
    public View.OnClickListener f353f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f354g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f355h0;

    /* renamed from: i0, reason: collision with root package name */
    public l0.b f356i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f357j0;

    /* renamed from: k0, reason: collision with root package name */
    public CharSequence f358k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f359l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f360m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f361n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f362o0;

    /* renamed from: p0, reason: collision with root package name */
    public CharSequence f363p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f364q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f365r0;

    /* renamed from: s0, reason: collision with root package name */
    public SearchableInfo f366s0;

    /* renamed from: t0, reason: collision with root package name */
    public Bundle f367t0;

    /* renamed from: u0, reason: collision with root package name */
    public final d3 f368u0;

    /* renamed from: v0, reason: collision with root package name */
    public final d3 f369v0;

    /* renamed from: w0, reason: collision with root package name */
    public final WeakHashMap f370w0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends q {

        /* renamed from: e, reason: collision with root package name */
        public int f371e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f372f;

        /* renamed from: x, reason: collision with root package name */
        public boolean f373x;

        /* renamed from: y, reason: collision with root package name */
        public final r3 f374y;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f374y = new r3(this);
            this.f371e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k3.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o3 o3Var = SearchView.f347x0;
            o3Var.getClass();
            o3.o();
            Object obj = o3Var.f599c;
            if (((Method) obj) != null) {
                try {
                    ((Method) obj).invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f371e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.q, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f373x) {
                r3 r3Var = this.f374y;
                removeCallbacks(r3Var);
                post(r3Var);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z9, int i10, Rect rect) {
            super.onFocusChanged(z9, i10, rect);
            SearchView searchView = this.f372f;
            searchView.y(searchView.f355h0);
            searchView.post(searchView.f368u0);
            if (searchView.G.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f372f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z9) {
            super.onWindowFocusChanged(z9);
            if (z9 && this.f372f.hasFocus() && getVisibility() == 0) {
                boolean z10 = true;
                this.f373x = true;
                Context context = getContext();
                o3 o3Var = SearchView.f347x0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z10 = false;
                }
                if (z10) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z9) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            r3 r3Var = this.f374y;
            if (!z9) {
                this.f373x = false;
                removeCallbacks(r3Var);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f373x = false;
                    removeCallbacks(r3Var);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f373x = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f372f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f371e = i10;
        }
    }

    static {
        o3 o3Var;
        if (Build.VERSION.SDK_INT < 29) {
            o3Var = new o3();
        } else {
            o3Var = null;
        }
        f347x0 = o3Var;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // i.c
    public final void b() {
        if (this.f364q0) {
            return;
        }
        this.f364q0 = true;
        SearchAutoComplete searchAutoComplete = this.G;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f365r0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f360m0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f360m0 = false;
    }

    @Override // i.c
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f363p0 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f365r0);
        this.f364q0 = false;
    }

    public int getImeOptions() {
        return this.G.getImeOptions();
    }

    public int getInputType() {
        return this.G.getInputType();
    }

    public int getMaxWidth() {
        return this.f361n0;
    }

    public CharSequence getQuery() {
        return this.G.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f358k0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f366s0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f366s0.getHintId());
            }
            return this.f351d0;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f348a0;
    }

    public int getSuggestionRowLayout() {
        return this.W;
    }

    public l0.b getSuggestionsAdapter() {
        return this.f356i0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f363p0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f367t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f366s0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f367t0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.G;
        if (i10 >= 29) {
            k3.a(searchAutoComplete);
            return;
        }
        o3 o3Var = f347x0;
        o3Var.getClass();
        o3.o();
        Object obj = o3Var.f597a;
        if (((Method) obj) != null) {
            try {
                ((Method) obj).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o3Var.getClass();
        o3.o();
        Object obj2 = o3Var.f598b;
        if (((Method) obj2) != null) {
            try {
                ((Method) obj2).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.G;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f354g0) {
                clearFocus();
                y(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f368u0);
        post(this.f369v0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.g2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9) {
            SearchAutoComplete searchAutoComplete = this.G;
            int[] iArr = this.S;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.T;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.Q;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.R;
            rect2.set(i16, 0, i17, i18);
            s3 s3Var = this.P;
            if (s3Var == null) {
                s3 s3Var2 = new s3(rect2, rect, searchAutoComplete);
                this.P = s3Var2;
                setTouchDelegate(s3Var2);
            } else {
                s3Var.f642b.set(rect2);
                Rect rect3 = s3Var.f644d;
                rect3.set(rect2);
                int i19 = -s3Var.f645e;
                rect3.inset(i19, i19);
                s3Var.f643c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.g2, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f355h0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.f361n0) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.f361n0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.f361n0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof q3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q3 q3Var = (q3) parcelable;
        super.onRestoreInstanceState(q3Var.f7897a);
        y(q3Var.f622c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        q3 q3Var = new q3(super.onSaveInstanceState());
        q3Var.f622c = this.f355h0;
        return q3Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        post(this.f368u0);
    }

    public final void p(int i10) {
        int i11;
        Uri parse;
        String h10;
        Cursor cursor = this.f356i0.f6581c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i12 = u3.O;
                String h11 = u3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h11 == null) {
                    h11 = this.f366s0.getSuggestIntentAction();
                }
                if (h11 == null) {
                    h11 = "android.intent.action.SEARCH";
                }
                String h12 = u3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h12 == null) {
                    h12 = this.f366s0.getSuggestIntentData();
                }
                if (h12 != null && (h10 = u3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h12 = h12 + "/" + Uri.encode(h10);
                }
                if (h12 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h12);
                }
                intent = l(h11, parse, u3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), u3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i10) {
        Editable text = this.G.getText();
        Cursor cursor = this.f356i0.f6581c;
        if (cursor != null) {
            if (cursor.moveToPosition(i10)) {
                String c6 = this.f356i0.c(cursor);
                if (c6 != null) {
                    setQuery(c6);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f360m0 || !isFocusable()) {
            return false;
        }
        if (!this.f355h0) {
            boolean requestFocus = this.G.requestFocus(i10, rect);
            if (requestFocus) {
                y(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.G;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f366s0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f367t0 = bundle;
    }

    public void setIconified(boolean z9) {
        if (z9) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.G;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f353f0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z9) {
        if (this.f354g0 == z9) {
            return;
        }
        this.f354g0 = z9;
        y(z9);
        v();
    }

    public void setImeOptions(int i10) {
        this.G.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.G.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f361n0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l3 l3Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f352e0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m3 m3Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f353f0 = onClickListener;
    }

    public void setOnSuggestionListener(n3 n3Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f358k0 = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z9) {
        int i10;
        this.f359l0 = z9;
        l0.b bVar = this.f356i0;
        if (bVar instanceof u3) {
            u3 u3Var = (u3) bVar;
            if (z9) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            u3Var.G = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f366s0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.G
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f366s0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f366s0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f366s0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            l0.b r8 = r7.f356i0
            if (r8 == 0) goto L3e
            r8.b(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f366s0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.u3 r8 = new androidx.appcompat.widget.u3
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f366s0
            java.util.WeakHashMap r6 = r7.f370w0
            r8.<init>(r4, r7, r5, r6)
            r7.f356i0 = r8
            r0.setAdapter(r8)
            l0.b r8 = r7.f356i0
            androidx.appcompat.widget.u3 r8 = (androidx.appcompat.widget.u3) r8
            boolean r4 = r7.f359l0
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.G = r4
        L65:
            r7.v()
        L68:
            android.app.SearchableInfo r8 = r7.f366s0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f366s0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.f349b0
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f366s0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.f350c0
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.f362o0 = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.f355h0
            r7.y(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z9) {
        this.f357j0 = z9;
        y(this.f355h0);
    }

    public void setSuggestionsAdapter(l0.b bVar) {
        this.f356i0 = bVar;
        this.G.setAdapter(bVar);
    }

    public final void t() {
        int[] iArr;
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.G.getText());
        int i10 = 0;
        if (!z10 && (!this.f354g0 || this.f364q0)) {
            z9 = false;
        }
        if (!z9) {
            i10 = 8;
        }
        ImageView imageView = this.M;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z10) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void u() {
        int[] iArr;
        if (this.G.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.I.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.J.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z9 = this.f354g0;
        SearchAutoComplete searchAutoComplete = this.G;
        if (z9 && (drawable = this.V) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        boolean z9;
        int i10 = 0;
        if ((this.f357j0 || this.f362o0) && !this.f355h0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || (this.L.getVisibility() != 0 && this.N.getVisibility() != 0)) {
            i10 = 8;
        }
        this.J.setVisibility(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2.f362o0 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f357j0
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.f362o0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f355h0
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f362o0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.L
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.x(boolean):void");
    }

    public final void y(boolean z9) {
        int i10;
        int i11;
        int i12;
        this.f355h0 = z9;
        int i13 = 0;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z10 = !TextUtils.isEmpty(this.G.getText());
        this.K.setVisibility(i10);
        x(z10);
        if (z9) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.H.setVisibility(i11);
        ImageView imageView = this.U;
        if (imageView.getDrawable() != null && !this.f354g0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        t();
        boolean z11 = !z10;
        if (this.f362o0 && !this.f355h0 && z11) {
            this.L.setVisibility(8);
        } else {
            i13 = 8;
        }
        this.N.setVisibility(i13);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Q = new Rect();
        this.R = new Rect();
        this.S = new int[2];
        this.T = new int[2];
        int i11 = 0;
        this.f368u0 = new d3(this, i11);
        this.f369v0 = new d3(this, 1);
        this.f370w0 = new WeakHashMap();
        g3 g3Var = new g3(this);
        h3 h3Var = new h3(this);
        i3 i3Var = new i3(this);
        j3 j3Var = new j3(this, i11);
        i2 i2Var = new i2(this, 1);
        c3 c3Var = new c3(this, i11);
        int[] iArr = e.a.f3289u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        o3 o3Var = new o3(context, obtainStyledAttributes);
        g0.y0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(o3Var.i(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.G = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.H = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.I = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.J = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.K = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.L = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.M = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.N = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.U = imageView5;
        g0.h0.q(findViewById, o3Var.e(18));
        g0.h0.q(findViewById2, o3Var.e(23));
        imageView.setImageDrawable(o3Var.e(21));
        imageView2.setImageDrawable(o3Var.e(13));
        imageView3.setImageDrawable(o3Var.e(10));
        imageView4.setImageDrawable(o3Var.e(26));
        imageView5.setImageDrawable(o3Var.e(21));
        this.V = o3Var.e(20);
        p7.a0.W(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.W = o3Var.i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.f348a0 = o3Var.i(11, 0);
        imageView.setOnClickListener(g3Var);
        imageView3.setOnClickListener(g3Var);
        imageView2.setOnClickListener(g3Var);
        imageView4.setOnClickListener(g3Var);
        searchAutoComplete.setOnClickListener(g3Var);
        searchAutoComplete.addTextChangedListener(c3Var);
        searchAutoComplete.setOnEditorActionListener(i3Var);
        searchAutoComplete.setOnItemClickListener(j3Var);
        searchAutoComplete.setOnItemSelectedListener(i2Var);
        searchAutoComplete.setOnKeyListener(h3Var);
        searchAutoComplete.setOnFocusChangeListener(new e3(this));
        setIconifiedByDefault(o3Var.a(16, true));
        int d10 = o3Var.d(2, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.f351d0 = o3Var.k(12);
        this.f358k0 = o3Var.k(19);
        int h10 = o3Var.h(6, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = o3Var.h(5, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(o3Var.a(1, true));
        o3Var.p();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f349b0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f350c0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.O = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new f3(this, 0));
        }
        y(this.f354g0);
        v();
    }
}
