//  code generated by oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.cache.ICache;
import com.lark.oapi.core.cache.LocalCache;
import com.lark.oapi.core.enums.AppType;
import com.lark.oapi.core.enums.BaseUrlEnum;
import com.lark.oapi.core.httpclient.IHttpTransport;
import com.lark.oapi.core.httpclient.OkHttpTransport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.*;
import com.lark.oapi.core.utils.OKHttps;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.service.acs.v1.AcsService;
import com.lark.oapi.service.admin.v1.AdminService;
import com.lark.oapi.service.application.v6.ApplicationService;
import com.lark.oapi.service.approval.v4.ApprovalService;
import com.lark.oapi.service.attendance.v1.AttendanceService;
import com.lark.oapi.service.auth.v3.AuthService;
import com.lark.oapi.service.authen.v1.AuthenService;
import com.lark.oapi.service.baike.v1.BaikeService;
import com.lark.oapi.service.bitable.v1.BitableService;
import com.lark.oapi.service.block.v2.BlockService;
import com.lark.oapi.service.calendar.v4.CalendarService;
import com.lark.oapi.service.contact.v3.ContactService;
import com.lark.oapi.service.corehr.v1.CorehrService;
import com.lark.oapi.service.docx.v1.DocxService;
import com.lark.oapi.service.drive.v1.DriveService;
import com.lark.oapi.service.ehr.v1.EhrService;
import com.lark.oapi.service.event.v1.EventService;
import com.lark.oapi.service.ext.ExtService;
import com.lark.oapi.service.gray_test_open_sg.v1.GrayTestOpenSgService;
import com.lark.oapi.service.helpdesk.v1.HelpdeskService;
import com.lark.oapi.service.hire.v1.HireService;
import com.lark.oapi.service.human_authentication.v1.HumanAuthenticationService;
import com.lark.oapi.service.im.v1.ImService;
import com.lark.oapi.service.mail.v1.MailService;
import com.lark.oapi.service.mdm.v1.MdmService;
import com.lark.oapi.service.meeting_room.v1.MeetingRoomService;
import com.lark.oapi.service.okr.v1.OkrService;
import com.lark.oapi.service.optical_char_recognition.v1.OpticalCharRecognitionService;
import com.lark.oapi.service.passport.v1.PassportService;
import com.lark.oapi.service.personal_settings.v1.PersonalSettingsService;
import com.lark.oapi.service.search.v2.SearchService;
import com.lark.oapi.service.sheets.v3.SheetsService;
import com.lark.oapi.service.speech_to_text.v1.SpeechToTextService;
import com.lark.oapi.service.task.v1.TaskService;
import com.lark.oapi.service.tenant.v2.TenantService;
import com.lark.oapi.service.translation.v1.TranslationService;
import com.lark.oapi.service.vc.v1.VcService;
import com.lark.oapi.service.wiki.v2.WikiService;
import com.lark.oapi.service.workplace.v1.WorkplaceService;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;


public class Client {
    private Config config;
    private AcsService acs; // 智能门禁
    private AdminService admin; // 管理后台-数据报表
    private ApplicationService application; // 应用信息
    private ApprovalService approval; // 审批
    private AttendanceService attendance; // 打卡
    private AuthService auth; //
    private AuthenService authen; //
    private BaikeService baike; // 企业百科
    private BitableService bitable; // 云文档-多维表格
    private BlockService block; // 小组件
    private CalendarService calendar; // 日历
    private ContactService contact; // 通讯录
    private CorehrService corehr; // CoreHR
    private DocxService docx; // 云文档-文档
    private DriveService drive; // 云文档-文档
    private EhrService ehr; // 智能人事
    private EventService event; // 事件订阅
    private GrayTestOpenSgService grayTestOpenSg; //
    private HelpdeskService helpdesk; // 服务台
    private HireService hire; // 招聘
    private HumanAuthenticationService humanAuthentication; // 实名认证
    private ImService im; // 消息与群组
    private MailService mail; // 邮箱
    private MdmService mdm; // 主数据
    private MeetingRoomService meetingRoom; //
    private OkrService okr; // OKR
    private OpticalCharRecognitionService opticalCharRecognition; // AI能力
    private PassportService passport; // 帐号
    private PersonalSettingsService personalSettings; // 个人设置
    private SearchService search; // 搜索
    private SheetsService sheets; // 云文档-电子表格
    private SpeechToTextService speechToText; // AI能力
    private TaskService task; // 任务
    private TenantService tenant; // 企业信息
    private TranslationService translation; // AI能力
    private VcService vc; // 视频会议
    private WikiService wiki; // 云文档-知识库
    private WorkplaceService workplace; //

    private ExtService extService;

    public static Builder newBuilder(String appId, String appSecret) {
        return new Builder(appId, appSecret);
    }

    public ExtService ext() {
        return extService;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    /**
     * 智能门禁
     *
     * @return
     */
    public AcsService acs() {
        return acs;
    }

    /**
     * 管理后台-数据报表
     *
     * @return
     */
    public AdminService admin() {
        return admin;
    }

    /**
     * 应用信息
     *
     * @return
     */
    public ApplicationService application() {
        return application;
    }

    /**
     * 审批
     *
     * @return
     */
    public ApprovalService approval() {
        return approval;
    }

    /**
     * 打卡
     *
     * @return
     */
    public AttendanceService attendance() {
        return attendance;
    }

    /**
     * @return
     */
    public AuthService auth() {
        return auth;
    }

    /**
     * @return
     */
    public AuthenService authen() {
        return authen;
    }

    /**
     * 企业百科
     *
     * @return
     */
    public BaikeService baike() {
        return baike;
    }

    /**
     * 云文档-多维表格
     *
     * @return
     */
    public BitableService bitable() {
        return bitable;
    }

    /**
     * 小组件
     *
     * @return
     */
    public BlockService block() {
        return block;
    }

    /**
     * 日历
     *
     * @return
     */
    public CalendarService calendar() {
        return calendar;
    }

    /**
     * 通讯录
     *
     * @return
     */
    public ContactService contact() {
        return contact;
    }

    /**
     * CoreHR
     *
     * @return
     */
    public CorehrService corehr() {
        return corehr;
    }

    /**
     * 云文档-文档
     *
     * @return
     */
    public DocxService docx() {
        return docx;
    }

    /**
     * 云文档-文档
     *
     * @return
     */
    public DriveService drive() {
        return drive;
    }

    /**
     * 智能人事
     *
     * @return
     */
    public EhrService ehr() {
        return ehr;
    }

    /**
     * 事件订阅
     *
     * @return
     */
    public EventService event() {
        return event;
    }

    /**
     * @return
     */
    public GrayTestOpenSgService grayTestOpenSg() {
        return grayTestOpenSg;
    }

    /**
     * 服务台
     *
     * @return
     */
    public HelpdeskService helpdesk() {
        return helpdesk;
    }

    /**
     * 招聘
     *
     * @return
     */
    public HireService hire() {
        return hire;
    }

    /**
     * 实名认证
     *
     * @return
     */
    public HumanAuthenticationService humanAuthentication() {
        return humanAuthentication;
    }

    /**
     * 消息与群组
     *
     * @return
     */
    public ImService im() {
        return im;
    }

    /**
     * 邮箱
     *
     * @return
     */
    public MailService mail() {
        return mail;
    }

    /**
     * 主数据
     *
     * @return
     */
    public MdmService mdm() {
        return mdm;
    }

    /**
     * @return
     */
    public MeetingRoomService meetingRoom() {
        return meetingRoom;
    }

    /**
     * OKR
     *
     * @return
     */
    public OkrService okr() {
        return okr;
    }

    /**
     * AI能力
     *
     * @return
     */
    public OpticalCharRecognitionService opticalCharRecognition() {
        return opticalCharRecognition;
    }

    /**
     * 帐号
     *
     * @return
     */
    public PassportService passport() {
        return passport;
    }

    /**
     * 个人设置
     *
     * @return
     */
    public PersonalSettingsService personalSettings() {
        return personalSettings;
    }

    /**
     * 搜索
     *
     * @return
     */
    public SearchService search() {
        return search;
    }

    /**
     * 云文档-电子表格
     *
     * @return
     */
    public SheetsService sheets() {
        return sheets;
    }

    /**
     * AI能力
     *
     * @return
     */
    public SpeechToTextService speechToText() {
        return speechToText;
    }

    /**
     * 任务
     *
     * @return
     */
    public TaskService task() {
        return task;
    }

    /**
     * 企业信息
     *
     * @return
     */
    public TenantService tenant() {
        return tenant;
    }

    /**
     * AI能力
     *
     * @return
     */
    public TranslationService translation() {
        return translation;
    }

    /**
     * 视频会议
     *
     * @return
     */
    public VcService vc() {
        return vc;
    }

    /**
     * 云文档-知识库
     *
     * @return
     */
    public WikiService wiki() {
        return wiki;
    }

    /**
     * @return
     */
    public WorkplaceService workplace() {
        return workplace;
    }

    public RawResponse post(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "POST", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse post(String httpPath
            , Object body
            , AccessTokenType accessTokenType
    ) throws Exception {
        return Transport.send(config, null, "POST", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse get(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "GET", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse get(String httpPath
            , Object body
            , AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "GET", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse delete(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "DELETE", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse delete(String httpPath
            , Object body
            , AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "DELETE", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse put(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "PUT", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse put(String httpPath
            , Object body
            , AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "PUT", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse patch(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "PATCH", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse patch(String httpPath
            , Object body
            , AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "PATCH", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse options(String httpPath
            , Object body
            , AccessTokenType accessTokenType
            , RequestOptions requestOptions) throws Exception {
        return Transport.send(config, requestOptions, "OPTIONS", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public RawResponse options(String httpPath
            , Object body, AccessTokenType accessTokenType) throws Exception {
        return Transport.send(config, null, "OPTIONS", httpPath, Sets.newHashSet(accessTokenType), body);
    }

    public static final class Builder {
        private Config config = new Config();

        public Builder(String appId, String appSecret) {
            config.setAppId(appId);
            config.setAppSecret(appSecret);
            config.setBaseUrl(BaseUrlEnum.FeiShu.getUrl());
            config.setAppType(AppType.SELF_BUILT);
            config.setDisableTokenCache(false);
        }

        public Builder helpDeskCredential(String helpDeskId, String helpDeskToken) {
            config.setHelpDeskToken(helpDeskToken);
            config.setHelpDeskID(helpDeskId);
            if (Strings.isNotEmpty(helpDeskId) && Strings.isNotEmpty(helpDeskToken)) {
                config.setHelpDeskAuthToken(java.util.Base64.getEncoder().encodeToString(String.format("%s:%s", helpDeskId, helpDeskToken).getBytes(StandardCharsets.UTF_8)));
            }
            return this;
        }

        public Builder appType(AppType appType) {
            config.setAppType(appType);
            return this;
        }

        public Builder marketplaceApp() {
            config.setAppType(AppType.MARKETPLACE);
            return this;
        }

        public Builder disableTokenCache() {
            config.setDisableTokenCache(true);
            return this;
        }

        public Builder logReqAtDebug(boolean logReqRespInfoAtDebugLevel) {
            config.setLogReqAtDebug(logReqRespInfoAtDebugLevel);
            return this;
        }

        public Builder openBaseUrl(String baseUrl) {
            config.setBaseUrl(baseUrl);
            return this;
        }

        public Builder openBaseUrl(BaseUrlEnum baseUrl) {
            config.setBaseUrl(baseUrl.getUrl());
            return this;
        }

        public Builder tokenCache(ICache cache) {
            config.setCache(cache);
            return this;
        }

        public Builder requestTimeout(long timeout, TimeUnit timeUnit) {
            config.setRequestTimeOut(timeout);
            config.setTimeOutTimeUnit(timeUnit);
            return this;
        }

        public Builder httpTransport(IHttpTransport httpTransport) {
            config.setHttpTransport(httpTransport);
            return this;
        }

        private void initCache(Config config) {
            if (config.getCache() != null) {
                GlobalAppTicketManager.setAppTicketManager(new AppTicketManager(config.getCache()));
                GlobalTokenManager.setTokenManager(new TokenManager(config.getCache()));
            } else {
                ICache cache = LocalCache.getInstance();
                GlobalAppTicketManager.setAppTicketManager(new AppTicketManager(cache));
                GlobalTokenManager.setTokenManager(new TokenManager(cache));
            }
        }

        private void initHttpTransport(Config config) {
            if (config.getHttpTransport() == null) {
                if (config.getRequestTimeOut() > 0) {
                    config.setHttpTransport(new OkHttpTransport(OKHttps.create(config.getRequestTimeOut(), config.getTimeOutTimeUnit())));
                } else {
                    config.setHttpTransport(new OkHttpTransport(OKHttps.defaultClient));
                }
            }
        }

        public Client build() {
            Client client = new Client();
            client.setConfig(config);
            initCache(config);
            initHttpTransport(config);
            client.extService = new ExtService(config);
            client.acs = new AcsService(config);
            client.admin = new AdminService(config);
            client.application = new ApplicationService(config);
            client.approval = new ApprovalService(config);
            client.attendance = new AttendanceService(config);
            client.auth = new AuthService(config);
            client.authen = new AuthenService(config);
            client.baike = new BaikeService(config);
            client.bitable = new BitableService(config);
            client.block = new BlockService(config);
            client.calendar = new CalendarService(config);
            client.contact = new ContactService(config);
            client.corehr = new CorehrService(config);
            client.docx = new DocxService(config);
            client.drive = new DriveService(config);
            client.ehr = new EhrService(config);
            client.event = new EventService(config);
            client.grayTestOpenSg = new GrayTestOpenSgService(config);
            client.helpdesk = new HelpdeskService(config);
            client.hire = new HireService(config);
            client.humanAuthentication = new HumanAuthenticationService(config);
            client.im = new ImService(config);
            client.mail = new MailService(config);
            client.mdm = new MdmService(config);
            client.meetingRoom = new MeetingRoomService(config);
            client.okr = new OkrService(config);
            client.opticalCharRecognition = new OpticalCharRecognitionService(config);
            client.passport = new PassportService(config);
            client.personalSettings = new PersonalSettingsService(config);
            client.search = new SearchService(config);
            client.sheets = new SheetsService(config);
            client.speechToText = new SpeechToTextService(config);
            client.task = new TaskService(config);
            client.tenant = new TenantService(config);
            client.translation = new TranslationService(config);
            client.vc = new VcService(config);
            client.wiki = new WikiService(config);
            client.workplace = new WorkplaceService(config);

            return client;
        }
    }
}

