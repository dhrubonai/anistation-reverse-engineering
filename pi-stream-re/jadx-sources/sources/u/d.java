package u;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public a f10104a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10105b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10106c;

    /* renamed from: d, reason: collision with root package name */
    public int f10107d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10108e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10109f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10110g;

    /* renamed from: h, reason: collision with root package name */
    public int f10111h;

    /* renamed from: i, reason: collision with root package name */
    public int f10112i;

    /* renamed from: j, reason: collision with root package name */
    public int f10113j;

    /* renamed from: k, reason: collision with root package name */
    public View f10114k;

    /* renamed from: l, reason: collision with root package name */
    public View f10115l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10116m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10117n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f10118p;

    public d() {
        super(-2, -2);
        this.f10105b = false;
        this.f10106c = 0;
        this.f10107d = 0;
        this.f10108e = -1;
        this.f10109f = -1;
        this.f10110g = 0;
        this.f10111h = 0;
        this.f10118p = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return this.o;
        }
        return this.f10117n;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        this.f10105b = false;
        this.f10106c = 0;
        this.f10107d = 0;
        this.f10108e = -1;
        this.f10109f = -1;
        this.f10110g = 0;
        this.f10111h = 0;
        this.f10118p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.a.f9951b);
        this.f10106c = obtainStyledAttributes.getInteger(0, 0);
        this.f10109f = obtainStyledAttributes.getResourceId(1, -1);
        this.f10107d = obtainStyledAttributes.getInteger(2, 0);
        this.f10108e = obtainStyledAttributes.getInteger(6, -1);
        this.f10110g = obtainStyledAttributes.getInt(5, 0);
        this.f10111h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f10105b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.K;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.K;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.M;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.L);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(r.f.d("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f10104a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.f10104a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f10105b = false;
        this.f10106c = 0;
        this.f10107d = 0;
        this.f10108e = -1;
        this.f10109f = -1;
        this.f10110g = 0;
        this.f10111h = 0;
        this.f10118p = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f10105b = false;
        this.f10106c = 0;
        this.f10107d = 0;
        this.f10108e = -1;
        this.f10109f = -1;
        this.f10110g = 0;
        this.f10111h = 0;
        this.f10118p = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f10105b = false;
        this.f10106c = 0;
        this.f10107d = 0;
        this.f10108e = -1;
        this.f10109f = -1;
        this.f10110g = 0;
        this.f10111h = 0;
        this.f10118p = new Rect();
    }
}
