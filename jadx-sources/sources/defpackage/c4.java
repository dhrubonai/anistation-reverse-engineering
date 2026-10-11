package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class c4 {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String b(Context context) {
        return context.getAttributionTag();
    }

    public static void c(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static ArrayList d(List list) {
        String id;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info g = y3.g(it.next());
            if (g != null) {
                id = g.getId();
                arrayList.add(id);
            }
        }
        return arrayList;
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets f(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void g(Window window, boolean z) {
        int i;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility & (-257);
        } else {
            i = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i);
        window.setDecorFitsSystemWindows(z);
    }

    public static void h(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void i(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void j(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void k(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x004d. Please report as an issue. */
    public static RouteDiscoveryPreference l(ds3 ds3Var) {
        ds3Var.a();
        ks3 ks3Var = ds3Var.b;
        ks3Var.a();
        if (ks3Var.b.contains(null)) {
            y3.p();
            return new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        }
        boolean b = ds3Var.b();
        ArrayList arrayList = new ArrayList();
        ds3Var.a();
        ArrayList c = ds3Var.b.c();
        int size = c.size();
        int i = 0;
        while (i < size) {
            Object obj = c.get(i);
            i++;
            String str = (String) obj;
            str.getClass();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2065577523:
                    if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 956939050:
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 975975375:
                    if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1601181366:
                    if (str.equals("android.media.intent.category.REMOTE_AUDIO_PLAYBACK")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1693091761:
                    if (str.equals("android.media.intent.category.REMOTE_VIDEO_PLAYBACK")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    str = "android.media.route.feature.REMOTE_PLAYBACK";
                    break;
                case 1:
                    str = "android.media.route.feature.LIVE_AUDIO";
                    break;
                case 2:
                    str = "android.media.route.feature.LIVE_VIDEO";
                    break;
                case 3:
                    str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                    break;
                case 4:
                    str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                    break;
            }
            arrayList.add(str);
        }
        return new RouteDiscoveryPreference.Builder(arrayList, b).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cs3 m(android.media.MediaRoute2Info r13) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c4.m(android.media.MediaRoute2Info):cs3");
    }
}
