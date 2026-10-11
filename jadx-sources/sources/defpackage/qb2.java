package defpackage;

import com.anistation.model.Page;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qb2 extends LinkedHashMap {
    public static final /* synthetic */ int y = 0;
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb2(int i, float f, boolean z, byte b) {
        super(i, f, z);
        this.x = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Matcher a(Pattern pattern, String str) {
        Matcher matcher = (Matcher) get(pattern);
        if (matcher == null) {
            Matcher matcher2 = pattern.matcher(str);
            put(pattern, matcher2);
            return matcher2;
        }
        matcher.reset(str);
        return matcher;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsKey(Object obj) {
        switch (this.x) {
            case 2:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.containsKey((String) obj);
            case 3:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.containsKey((String) obj);
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsValue(Object obj) {
        switch (this.x) {
            case 2:
                if (!(obj instanceof Page)) {
                    return false;
                }
                return super.containsValue((Page) obj);
            case 3:
                if (!(obj instanceof List)) {
                    return false;
                }
                return super.containsValue((List) obj);
            default:
                return super.containsValue(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object get(Object obj) {
        switch (this.x) {
            case 2:
                if (!(obj instanceof String)) {
                    return null;
                }
                return (Page) super.get((String) obj);
            case 3:
                if (!(obj instanceof String)) {
                    return null;
                }
                return (List) super.get((String) obj);
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.x) {
            case 2:
                if (obj instanceof String) {
                    return (Page) super.getOrDefault((String) obj, (Page) obj2);
                }
                return obj2;
            case 3:
                if (obj instanceof String) {
                    return (List) super.getOrDefault((String) obj, (List) obj2);
                }
                return obj2;
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.x) {
            case 2:
                if (!(obj instanceof String) || !(obj2 instanceof Page)) {
                    return false;
                }
                return super.remove((String) obj, (Page) obj2);
            case 3:
                if (!(obj instanceof String) || !(obj2 instanceof List)) {
                    return false;
                }
                return super.remove((String) obj, (List) obj2);
            default:
                return super.remove(obj, obj2);
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.x) {
            case 0:
                if (size() > 4) {
                    return true;
                }
                return false;
            case 1:
                if (size() > 32) {
                    return true;
                }
                return false;
            case 2:
                if (super.size() > 50) {
                    return true;
                }
                return false;
            default:
                if (super.size() > 50) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object remove(Object obj) {
        switch (this.x) {
            case 2:
                if (obj instanceof String) {
                    return (Page) super.remove((String) obj);
                }
                return null;
            case 3:
                if (obj instanceof String) {
                    return (List) super.remove((String) obj);
                }
                return null;
            default:
                return super.remove(obj);
        }
    }
}
