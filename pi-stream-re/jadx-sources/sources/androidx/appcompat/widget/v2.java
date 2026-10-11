package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;

/* loaded from: classes.dex */
public final class v2 implements x2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f672a;

    public /* synthetic */ v2(int i10) {
        this.f672a = i10;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f672a) {
            case 0:
                try {
                    return g.e.e(context, theme, context.getResources(), attributeSet, xmlResourceParser);
                } catch (Exception e10) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                    return null;
                }
            case 1:
                try {
                    Resources resources = context.getResources();
                    r3.d dVar = new r3.d(context);
                    dVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return dVar;
                } catch (Exception e11) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e11);
                    return null;
                }
            case 2:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) v2.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    h.b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e12) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e12);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    r3.o oVar = new r3.o();
                    oVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return oVar;
                } catch (Exception e13) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e13);
                    return null;
                }
        }
    }
}
