package com.anistation.navigation;

import defpackage.a34;
import defpackage.aj5;
import defpackage.bx7;
import defpackage.e73;
import defpackage.hc4;
import defpackage.hu0;
import defpackage.i13;
import defpackage.iq4;
import defpackage.jf3;
import defpackage.jj5;
import defpackage.kj5;
import defpackage.q71;
import defpackage.qa4;
import defpackage.qx1;
import defpackage.r75;
import defpackage.rb3;
import defpackage.v0;
import defpackage.vd5;
import defpackage.x73;
import defpackage.z05;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public interface Route {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class About implements Route {
        public static final int $stable = 0;
        public static final About INSTANCE = new About();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new qa4((byte) 29));

        private About() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.About", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof About)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1485733943;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "About";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class Backup implements Route {
        public static final int $stable = 0;
        public static final Backup INSTANCE = new Backup();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 0));

        private Backup() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.Backup", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Backup)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1159549352;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Backup";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class BugReport implements Route {
        public static final int $stable = 0;
        public static final BugReport INSTANCE = new BugReport();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 1));

        private BugReport() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.BugReport", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof BugReport)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -691662734;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "BugReport";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final x73 serializer() {
            return new vd5(z05.a(Route.class), new e73[]{z05.a(About.class), z05.a(Backup.class), z05.a(BugReport.class), z05.a(Details.class), z05.a(Donate.class), z05.a(DownloadList.class), z05.a(DownloadSettings.class), z05.a(Downloads.class), z05.a(ExperimentalSettings.class), z05.a(Home.class), z05.a(ImportExport.class), z05.a(MyList.class), z05.a(PlayerSettings.class), z05.a(Schedule.class), z05.a(Search.class), z05.a(Settings.class), z05.a(SubtitleSettings.class)}, new x73[]{new hc4("com.anistation.navigation.Route.About", About.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.Backup", Backup.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.BugReport", BugReport.INSTANCE, new Annotation[0]), Route$Details$$serializer.INSTANCE, new hc4("com.anistation.navigation.Route.Donate", Donate.INSTANCE, new Annotation[0]), Route$DownloadList$$serializer.INSTANCE, new hc4("com.anistation.navigation.Route.DownloadSettings", DownloadSettings.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.Downloads", Downloads.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.ExperimentalSettings", ExperimentalSettings.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.Home", Home.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.ImportExport", ImportExport.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.MyList", MyList.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.PlayerSettings", PlayerSettings.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.Schedule", Schedule.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.Search", Search.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.Settings", Settings.INSTANCE, new Annotation[0]), new hc4("com.anistation.navigation.Route.SubtitleSettings", SubtitleSettings.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class Donate implements Route {
        public static final int $stable = 0;
        public static final Donate INSTANCE = new Donate();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 2));

        private Donate() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.Donate", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Donate)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1089043707;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Donate";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class DownloadSettings implements Route {
        public static final int $stable = 0;
        public static final DownloadSettings INSTANCE = new DownloadSettings();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 3));

        private DownloadSettings() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.DownloadSettings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof DownloadSettings)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1069034015;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "DownloadSettings";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class Downloads implements Route {
        public static final int $stable = 0;
        public static final Downloads INSTANCE = new Downloads();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 4));

        private Downloads() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.Downloads", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Downloads)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 244662421;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Downloads";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class ExperimentalSettings implements Route {
        public static final int $stable = 0;
        public static final ExperimentalSettings INSTANCE = new ExperimentalSettings();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 5));

        private ExperimentalSettings() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.ExperimentalSettings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof ExperimentalSettings)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1122431167;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ExperimentalSettings";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class Home implements Route {
        public static final int $stable = 0;
        public static final Home INSTANCE = new Home();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 6));

        private Home() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.Home", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Home)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -644588811;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Home";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class ImportExport implements Route {
        public static final int $stable = 0;
        public static final ImportExport INSTANCE = new ImportExport();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 7));

        private ImportExport() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.ImportExport", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof ImportExport)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 917525455;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ImportExport";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class MyList implements Route {
        public static final int $stable = 0;
        public static final MyList INSTANCE = new MyList();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 8));

        private MyList() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.MyList", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof MyList)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -823151360;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "MyList";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class PlayerSettings implements Route {
        public static final int $stable = 0;
        public static final PlayerSettings INSTANCE = new PlayerSettings();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 9));

        private PlayerSettings() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.PlayerSettings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof PlayerSettings)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 537562298;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "PlayerSettings";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class Schedule implements Route {
        public static final int $stable = 0;
        public static final Schedule INSTANCE = new Schedule();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 10));

        private Schedule() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.Schedule", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Schedule)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -455279187;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Schedule";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class Search implements Route {
        public static final int $stable = 0;
        public static final Search INSTANCE = new Search();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 11));

        private Search() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.Search", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Search)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -669213122;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Search";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class Settings implements Route {
        public static final int $stable = 0;
        public static final Settings INSTANCE = new Settings();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 12));

        private Settings() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.Settings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof Settings)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1677272889;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Settings";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class SubtitleSettings implements Route {
        public static final int $stable = 0;
        public static final SubtitleSettings INSTANCE = new SubtitleSettings();
        private static final /* synthetic */ rb3 $cachedSerializer$delegate = bx7.B(jf3.y, new r75((byte) 13));

        private SubtitleSettings() {
        }

        public static final /* synthetic */ x73 _init_$_anonymous_() {
            return new hc4("com.anistation.navigation.Route.SubtitleSettings", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ x73 get$cachedSerializer() {
            return (x73) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof SubtitleSettings)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 128436593;
        }

        public final x73 serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SubtitleSettings";
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class Details implements Route {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String animeId;

        public /* synthetic */ Details(int i, String str, kj5 kj5Var) {
            if (1 != (i & 1)) {
                iq4.throwMissingFieldException(i, 1, Route$Details$$serializer.INSTANCE.getDescriptor());
            }
            this.animeId = str;
        }

        public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = details.animeId;
            }
            return details.copy(str);
        }

        public final String component1() {
            return this.animeId;
        }

        public final Details copy(String str) {
            str.getClass();
            return new Details(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Details) && a34.i(this.animeId, ((Details) obj).animeId)) {
                return true;
            }
            return false;
        }

        public final String getAnimeId() {
            return this.animeId;
        }

        public int hashCode() {
            return this.animeId.hashCode();
        }

        public String toString() {
            return qx1.m("Details(animeId=", this.animeId, ")");
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final x73 serializer() {
                return Route$Details$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Details(String str) {
            str.getClass();
            this.animeId = str;
        }
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    @jj5
    /* loaded from: classes.dex */
    public static final class DownloadList implements Route {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final Integer anilistId;
        private final String animeId;

        public /* synthetic */ DownloadList(int i, String str, Integer num, kj5 kj5Var) {
            if (1 != (i & 1)) {
                iq4.throwMissingFieldException(i, 1, Route$DownloadList$$serializer.INSTANCE.getDescriptor());
            }
            this.animeId = str;
            if ((i & 2) == 0) {
                this.anilistId = null;
            } else {
                this.anilistId = num;
            }
        }

        public static /* synthetic */ DownloadList copy$default(DownloadList downloadList, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = downloadList.animeId;
            }
            if ((i & 2) != 0) {
                num = downloadList.anilistId;
            }
            return downloadList.copy(str, num);
        }

        public static final /* synthetic */ void write$Self$navigation(DownloadList downloadList, hu0 hu0Var, aj5 aj5Var) {
            v0 v0Var = (v0) hu0Var;
            v0Var.w(aj5Var, 0, downloadList.animeId);
            if (v0Var.shouldEncodeElementDefault(aj5Var, 1) || downloadList.anilistId != null) {
                v0Var.encodeNullableSerializableElement(aj5Var, 1, i13.a, downloadList.anilistId);
            }
        }

        public final String component1() {
            return this.animeId;
        }

        public final Integer component2() {
            return this.anilistId;
        }

        public final DownloadList copy(String str, Integer num) {
            str.getClass();
            return new DownloadList(str, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownloadList)) {
                return false;
            }
            DownloadList downloadList = (DownloadList) obj;
            if (a34.i(this.animeId, downloadList.animeId) && a34.i(this.anilistId, downloadList.anilistId)) {
                return true;
            }
            return false;
        }

        public final Integer getAnilistId() {
            return this.anilistId;
        }

        public final String getAnimeId() {
            return this.animeId;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.animeId.hashCode() * 31;
            Integer num = this.anilistId;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "DownloadList(animeId=" + this.animeId + ", anilistId=" + this.anilistId + ")";
        }

        /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(q71 q71Var) {
                this();
            }

            public final x73 serializer() {
                return Route$DownloadList$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public DownloadList(String str, Integer num) {
            str.getClass();
            this.animeId = str;
            this.anilistId = num;
        }

        public /* synthetic */ DownloadList(String str, Integer num, int i, q71 q71Var) {
            this(str, (i & 2) != 0 ? null : num);
        }
    }
}
