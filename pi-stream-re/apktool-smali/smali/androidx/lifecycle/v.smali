.class public final Landroidx/lifecycle/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroidx/lifecycle/o;

.field public final b:Landroidx/lifecycle/s;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/t;Landroidx/lifecycle/o;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Landroidx/lifecycle/x;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    instance-of v0, p1, Landroidx/lifecycle/s;

    .line 10
    .line 11
    instance-of v1, p1, Lq0/m;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroidx/lifecycle/g;

    .line 18
    .line 19
    move-object v1, p1

    .line 20
    check-cast v1, Lq0/m;

    .line 21
    .line 22
    check-cast p1, Landroidx/lifecycle/s;

    .line 23
    .line 24
    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/g;-><init>(Lq0/m;Landroidx/lifecycle/s;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    new-instance v0, Landroidx/lifecycle/g;

    .line 32
    .line 33
    check-cast p1, Lq0/m;

    .line 34
    .line 35
    invoke-direct {v0, p1, v2}, Landroidx/lifecycle/g;-><init>(Lq0/m;Landroidx/lifecycle/s;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    if-eqz v0, :cond_2

    .line 40
    .line 41
    move-object v0, p1

    .line 42
    check-cast v0, Landroidx/lifecycle/s;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Landroidx/lifecycle/x;->b(Ljava/lang/Class;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v3, 0x2

    .line 54
    if-ne v1, v3, :cond_5

    .line 55
    .line 56
    sget-object v1, Landroidx/lifecycle/x;->b:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v3, 0x1

    .line 72
    const/4 v4, 0x0

    .line 73
    if-eq v1, v3, :cond_4

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    new-array v3, v1, [Landroidx/lifecycle/i;

    .line 80
    .line 81
    if-gtz v1, :cond_3

    .line 82
    .line 83
    new-instance v0, Landroidx/lifecycle/e;

    .line 84
    .line 85
    invoke-direct {v0, v3}, Landroidx/lifecycle/e;-><init>([Landroidx/lifecycle/i;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 94
    .line 95
    invoke-static {p2, p1}, Landroidx/lifecycle/x;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    throw v2

    .line 99
    :cond_4
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 104
    .line 105
    invoke-static {p2, p1}, Landroidx/lifecycle/x;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    throw v2

    .line 109
    :cond_5
    new-instance v0, Landroidx/lifecycle/g;

    .line 110
    .line 111
    invoke-direct {v0, p1}, Landroidx/lifecycle/g;-><init>(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    iput-object v0, p0, Landroidx/lifecycle/v;->b:Landroidx/lifecycle/s;

    .line 115
    .line 116
    iput-object p2, p0, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 117
    .line 118
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroidx/lifecycle/n;->a()Landroidx/lifecycle/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 6
    .line 7
    const-string v2, "state1"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-gez v2, :cond_0

    .line 17
    .line 18
    move-object v1, v0

    .line 19
    :cond_0
    iput-object v1, p0, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/lifecycle/v;->b:Landroidx/lifecycle/s;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/s;->onStateChanged(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Landroidx/lifecycle/v;->a:Landroidx/lifecycle/o;

    .line 27
    .line 28
    return-void
.end method
