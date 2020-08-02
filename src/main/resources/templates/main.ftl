<#import "parts/common.ftl" as c>

<@c.page>
    <table class="table">
        <caption>List of currency</caption>
        <thead>
        <#list currrency?keys as key>
        <tr>
            <th scope="col">${key}</th>
            <td>${currrency[key]}</td>
        </tr>
            </#list>
        </thead>

    </table>


</@c.page>
