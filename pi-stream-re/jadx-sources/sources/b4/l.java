package b4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1476a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1477b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1478c;

    public l(ArrayList arrayList, f0.c cVar) {
        this.f1477b = arrayList;
        this.f1478c = cVar;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, v3.l lVar) {
        w a10;
        int i12 = this.f1476a;
        Object obj2 = this.f1478c;
        w wVar = null;
        Object obj3 = this.f1477b;
        switch (i12) {
            case 0:
                return c((Integer) obj, i10, i11, lVar);
            case 1:
                List list = (List) obj3;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                v3.i iVar = null;
                for (int i13 = 0; i13 < size; i13++) {
                    x xVar = (x) list.get(i13);
                    if (xVar.b(obj) && (a10 = xVar.a(obj, i10, i11, lVar)) != null) {
                        arrayList.add(a10.f1503c);
                        iVar = a10.f1501a;
                    }
                }
                if (arrayList.isEmpty() || iVar == null) {
                    return null;
                }
                return new w(iVar, new a0(arrayList, (f0.c) obj2));
            case 2:
                return c((Integer) obj, i10, i11, lVar);
            default:
                Uri uri = (Uri) obj;
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                        if (parseInt == 0) {
                            if (Log.isLoggable("ResourceUriLoader", 5)) {
                                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                            }
                        } else {
                            wVar = ((x) obj2).a(Integer.valueOf(parseInt), i10, i11, lVar);
                        }
                        return wVar;
                    } catch (NumberFormatException e10) {
                        if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
                            return wVar;
                        }
                        return wVar;
                    }
                }
                if (pathSegments.size() == 2) {
                    List<String> pathSegments2 = uri.getPathSegments();
                    Context context = (Context) obj3;
                    int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                    if (identifier == 0) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                        return null;
                    }
                    return ((x) obj2).a(Integer.valueOf(identifier), i10, i11, lVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
                return null;
        }
    }

    @Override // b4.x
    public final boolean b(Object obj) {
        int i10 = this.f1476a;
        Object obj2 = this.f1477b;
        switch (i10) {
            case 0:
                return true;
            case 1:
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    if (((x) it.next()).b(obj)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return true;
            default:
                Uri uri = (Uri) obj;
                if (!"android.resource".equals(uri.getScheme()) || !((Context) obj2).getPackageName().equals(uri.getAuthority())) {
                    return false;
                }
                return true;
        }
    }

    public final w c(Integer num, int i10, int i11, v3.l lVar) {
        Uri uri;
        Resources resources;
        int i12 = this.f1476a;
        Object obj = this.f1478c;
        Object obj2 = this.f1477b;
        switch (i12) {
            case 0:
                Resources.Theme theme = (Resources.Theme) lVar.c(f4.f.f3921b);
                if (theme != null) {
                    resources = theme.getResources();
                } else {
                    resources = ((Context) obj2).getResources();
                }
                return new w(new o4.b(num), new j(theme, resources, (k) obj, num.intValue()));
            default:
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj).getResourcePackageName(num.intValue()) + '/' + ((Resources) obj).getResourceTypeName(num.intValue()) + '/' + ((Resources) obj).getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException e10) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((x) obj2).a(uri, i10, i11, lVar);
        }
    }

    public final String toString() {
        switch (this.f1476a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.f1477b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public l(Resources resources, x xVar) {
        this.f1478c = resources;
        this.f1477b = xVar;
    }

    public l(Context context, k kVar) {
        this.f1477b = context.getApplicationContext();
        this.f1478c = kVar;
    }

    public l(Context context, x xVar) {
        this.f1477b = context.getApplicationContext();
        this.f1478c = xVar;
    }
}
