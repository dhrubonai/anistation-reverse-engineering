.class Lcom/google/firebase/concurrent/CustomThreadFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# static fields
.field private static final DEFAULT:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private final namePrefix:Ljava/lang/String;

.field private final policy:Landroid/os/StrictMode$ThreadPolicy;

.field private final priority:I

.field private final threadCount:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/google/firebase/concurrent/CustomThreadFactory;->DEFAULT:Ljava/util/concurrent/ThreadFactory;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/firebase/concurrent/CustomThreadFactory;->threadCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/firebase/concurrent/CustomThreadFactory;->namePrefix:Ljava/lang/String;

    .line 12
    .line 13
    iput p2, p0, Lcom/google/firebase/concurrent/CustomThreadFactory;->priority:I

    .line 14
    .line 15
    iput-object p3, p0, Lcom/google/firebase/concurrent/CustomThreadFactory;->policy:Landroid/os/StrictMode$ThreadPolicy;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/concurrent/CustomThreadFactory;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/concurrent/CustomThreadFactory;->lambda$newThread$0(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic lambda$newThread$0(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/firebase/concurrent/CustomThreadFactory;->priority:I

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/firebase/concurrent/CustomThreadFactory;->policy:Landroid/os/StrictMode$ThreadPolicy;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/firebase/concurrent/CustomThreadFactory;->DEFAULT:Ljava/util/concurrent/ThreadFactory;

    .line 2
    .line 3
    new-instance v1, Lcom/google/firebase/concurrent/a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2, p0, p1}, Lcom/google/firebase/concurrent/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, Lcom/google/firebase/concurrent/CustomThreadFactory;->namePrefix:Ljava/lang/String;

    .line 19
    .line 20
    aput-object v3, v1, v2

    .line 21
    .line 22
    iget-object v2, p0, Lcom/google/firebase/concurrent/CustomThreadFactory;->threadCount:Ljava/util/concurrent/atomic/AtomicLong;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x1

    .line 33
    aput-object v2, v1, v3

    .line 34
    .line 35
    const-string v2, "%s Thread #%d"

    .line 36
    .line 37
    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method
