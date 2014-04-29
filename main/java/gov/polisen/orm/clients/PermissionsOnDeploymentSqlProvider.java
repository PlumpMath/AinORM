package gov.polisen.orm.clients;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import gov.polisen.orm.examples.PermissionsOnDeploymentExample;
import gov.polisen.orm.examples.PermissionsOnDeploymentExample.Criteria;
import gov.polisen.orm.examples.PermissionsOnDeploymentExample.Criterion;
import gov.polisen.orm.models.PermissionsOnDeployment;
import java.util.List;
import java.util.Map;

public class PermissionsOnDeploymentSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_on_deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String countByExample(PermissionsOnDeploymentExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("permissions_on_deployments");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_on_deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String deleteByExample(PermissionsOnDeploymentExample example) {
        BEGIN();
        DELETE_FROM("permissions_on_deployments");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_on_deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String insertSelective(PermissionsOnDeployment record) {
        BEGIN();
        INSERT_INTO("permissions_on_deployments");
        
        if (record.getDeploymentId() != null) {
            VALUES("deployment_id", "#{deploymentId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getRead() != null) {
            VALUES("read", "#{read,jdbcType=BIT}");
        }
        
        if (record.getAddData() != null) {
            VALUES("add_data", "#{addData,jdbcType=BIT}");
        }
        
        if (record.getModify() != null) {
            VALUES("modify", "#{modify,jdbcType=BIT}");
        }
        
        if (record.getChangePermissions() != null) {
            VALUES("change_permissions", "#{changePermissions,jdbcType=BIT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_on_deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String selectByExample(PermissionsOnDeploymentExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("deployment_id");
        } else {
            SELECT("deployment_id");
        }
        SELECT("user_id");
        SELECT("read");
        SELECT("add_data");
        SELECT("modify");
        SELECT("change_permissions");
        FROM("permissions_on_deployments");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_on_deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        PermissionsOnDeployment record = (PermissionsOnDeployment) parameter.get("record");
        PermissionsOnDeploymentExample example = (PermissionsOnDeploymentExample) parameter.get("example");
        
        BEGIN();
        UPDATE("permissions_on_deployments");
        
        if (record.getDeploymentId() != null) {
            SET("deployment_id = #{record.deploymentId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getRead() != null) {
            SET("read = #{record.read,jdbcType=BIT}");
        }
        
        if (record.getAddData() != null) {
            SET("add_data = #{record.addData,jdbcType=BIT}");
        }
        
        if (record.getModify() != null) {
            SET("modify = #{record.modify,jdbcType=BIT}");
        }
        
        if (record.getChangePermissions() != null) {
            SET("change_permissions = #{record.changePermissions,jdbcType=BIT}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_on_deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("permissions_on_deployments");
        
        SET("deployment_id = #{record.deploymentId,jdbcType=INTEGER}");
        SET("user_id = #{record.userId,jdbcType=INTEGER}");
        SET("read = #{record.read,jdbcType=BIT}");
        SET("add_data = #{record.addData,jdbcType=BIT}");
        SET("modify = #{record.modify,jdbcType=BIT}");
        SET("change_permissions = #{record.changePermissions,jdbcType=BIT}");
        
        PermissionsOnDeploymentExample example = (PermissionsOnDeploymentExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_on_deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String updateByPrimaryKeySelective(PermissionsOnDeployment record) {
        BEGIN();
        UPDATE("permissions_on_deployments");
        
        if (record.getRead() != null) {
            SET("read = #{read,jdbcType=BIT}");
        }
        
        if (record.getAddData() != null) {
            SET("add_data = #{addData,jdbcType=BIT}");
        }
        
        if (record.getModify() != null) {
            SET("modify = #{modify,jdbcType=BIT}");
        }
        
        if (record.getChangePermissions() != null) {
            SET("change_permissions = #{changePermissions,jdbcType=BIT}");
        }
        
        WHERE("deployment_id = #{deploymentId,jdbcType=INTEGER}");
        WHERE("user_id = #{userId,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissions_on_deployments
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    protected void applyWhere(PermissionsOnDeploymentExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}