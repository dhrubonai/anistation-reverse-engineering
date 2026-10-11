package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ir3 extends y2 {
    public static final xf6 B;
    public final List x;
    public final Bundle y;
    public int z;
    public static final String[] A = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<ir3> CREATOR = new an7(3);

    static {
        xf6 xf6Var = new xf6((byte) 9);
        xf6Var.j(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        xf6Var.j(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        xf6Var.j(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        xf6Var.j(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        xf6Var.j(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        xf6Var.j(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        xf6Var.j(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        xf6Var.j(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        xf6Var.j(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        xf6Var.j(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        xf6Var.j(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        xf6Var.j(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        xf6Var.j(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        xf6Var.j(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        xf6Var.j(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        xf6Var.j(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        xf6Var.j(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        xf6Var.j(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        B = xf6Var;
    }

    public ir3(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public static void f(int i, String str) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) ((HashMap) B.A).get(str);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            if (i2 != i && i2 != 0) {
                String str2 = A[i];
                ze0.k(h11.l(new StringBuilder(str.length() + 21 + String.valueOf(str2).length()), "Value for ", str, " must be a ", str2));
                return;
            }
            return;
        }
        ze0.k("null and empty keys are not allowed");
    }

    public static boolean i(Bundle bundle, Bundle bundle2) {
        if (bundle.size() == bundle2.size()) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle) || i((Bundle) obj, (Bundle) obj2)) {
                    if (obj == null) {
                        if (obj2 != null || !bundle2.containsKey(str)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final String c(String str) {
        f(1, str);
        return this.y.getString(str);
    }

    public final void d(String str, String str2) {
        f(1, str);
        this.y.putString(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ir3) {
                ir3 ir3Var = (ir3) obj;
                if (i(this.y, ir3Var.y) && this.x.equals(ir3Var.x)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final JSONObject g() {
        Bundle bundle;
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.z);
        } catch (JSONException unused) {
        }
        JSONArray b = gc7.b(this.x);
        if (b.length() != 0) {
            try {
                jSONObject.put("images", b);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.z;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                bundle = this.y;
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    xf6 xf6Var = B;
                    String str2 = (String) ((HashMap) xf6Var.y).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) xf6Var.A).get(str);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 5) {
                                            long j = bundle.getLong(str);
                                            Pattern pattern = qi0.a;
                                            jSONObject.put(str2, j / 1000.0d);
                                        }
                                    }
                                } else {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                }
                            } else {
                                jSONObject.put(str2, bundle.getInt(str));
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void h(JSONObject jSONObject) {
        int i;
        Bundle bundle = this.y;
        bundle.clear();
        List list = this.x;
        list.clear();
        this.z = 0;
        try {
            this.z = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            gc7.a(list, optJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.z;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    xf6 xf6Var = B;
                    String str = (String) ((HashMap) xf6Var.z).get(next);
                    if (str != null) {
                        if (hashSet.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    Integer num = (Integer) ((HashMap) xf6Var.A).get(str);
                                    if (num != null) {
                                        i = num.intValue();
                                    } else {
                                        i = 0;
                                    }
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                if (i != 4) {
                                                    if (i == 5) {
                                                        long optLong = jSONObject.optLong(next);
                                                        Pattern pattern = qi0.a;
                                                        bundle.putLong(str, optLong * 1000);
                                                    }
                                                } else if (obj instanceof String) {
                                                    String str2 = (String) obj;
                                                    if (gc7.c(str2) != null) {
                                                        bundle.putString(str, str2);
                                                    }
                                                }
                                            } else {
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    bundle.putDouble(str, optDouble);
                                                }
                                            }
                                        } else if (obj instanceof Integer) {
                                            bundle.putInt(str, ((Integer) obj).intValue());
                                        }
                                    } else if (obj instanceof String) {
                                        bundle.putString(str, (String) obj);
                                    }
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            bundle.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 17;
        Bundle bundle = this.y;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                int i3 = i2 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
        }
        return this.x.hashCode() + (i2 * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.p0(parcel, 2, this.x);
        z51.Z(parcel, 3, this.y);
        int i2 = this.z;
        z51.r0(parcel, 4, 4);
        parcel.writeInt(i2);
        z51.t0(parcel, s0);
    }

    public ir3(ArrayList arrayList, Bundle bundle, int i) {
        this.x = arrayList;
        this.y = bundle;
        this.z = i;
    }
}
